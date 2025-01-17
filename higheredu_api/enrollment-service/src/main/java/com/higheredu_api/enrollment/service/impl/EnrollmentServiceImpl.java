package com.higheredu_api.enrollment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.higheredu_api.enrollment.dto.DepartmentDto;
import com.higheredu_api.enrollment.dto.EnrollmentDto;
import com.higheredu_api.enrollment.dto.ResponseDto;
import com.higheredu_api.enrollment.dto.StudentDto;
import com.higheredu_api.enrollment.dto.CourseDto;
import com.higheredu_api.enrollment.model.Enrollment;
import com.higheredu_api.enrollment.repository.EnrollmentRepository;
import com.higheredu_api.enrollment.service.EnrollmentService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EnrollmentServiceImpl implements EnrollmentService {

    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    private EnrollmentRepository enrollmentRepository;
    
    @Override
    public ResponseDto getEnrollment(Long enrollmentId) {
        // Find the enrollment by its ID
        Enrollment enrollment = enrollmentRepository.findById(enrollmentId)
                .orElseThrow(() -> new RuntimeException("Enrollment not found for id: " + enrollmentId));

        // Fetch student details along with department details from the student service
        ResponseEntity<StudentDto> studentResponseEntity = restTemplate.getForEntity(
                "http://localhost:8082/api/students/" + enrollment.getStudentId(), StudentDto.class);
        if (!studentResponseEntity.getStatusCode().is2xxSuccessful() || studentResponseEntity.getBody() == null) {
            return null;
        }
       
        StudentDto student = studentResponseEntity.getBody();  

        // Fetch department details from department service using enrollment details
        ResponseEntity<DepartmentDto> departmentResponseEntity = restTemplate.getForEntity(
                "http://localhost:8081/api/departments/" + enrollment.getDepartmentId(), DepartmentDto.class);
        if (!departmentResponseEntity.getStatusCode().is2xxSuccessful() || departmentResponseEntity.getBody() == null) {
            return null;
        }
        DepartmentDto department = departmentResponseEntity.getBody();

        // Fetch course details from course service using enrollment details
        ResponseEntity<CourseDto> courseResponseEntity = restTemplate.getForEntity(
                "http://localhost:8084/api/courses/" + enrollment.getCourseId(), CourseDto.class);
        if (!courseResponseEntity.getStatusCode().is2xxSuccessful() || courseResponseEntity.getBody() == null) {
            return null;
        }
        CourseDto course = courseResponseEntity.getBody();

        // Construct the final response with enrollment details
        ResponseDto responseDto = new ResponseDto();
        responseDto.setStudent(student);
        responseDto.setDepartment(department);
        responseDto.setCourse(course);
        responseDto.setEnrollment(new EnrollmentDto(
            enrollment.getId(), 
            enrollment.getName(), 
            enrollment.getEmail(), 
            enrollment.getStudentId(), 
            enrollment.getDepartmentId(), 
            enrollment.getCourseId(),
            enrollment.getEnrollmentDate(), 
            enrollment.getEnrollmentType(), 
            enrollment.getEnrollmentState()  
        ));

        return responseDto;
    }

    @Override
    public EnrollmentDto saveEnrollment(EnrollmentDto enrollmentDto) {
        // Save enrollment details 
        Enrollment enrollment = new Enrollment();
        enrollment.setName(enrollmentDto.getName());
        enrollment.setEmail(enrollmentDto.getEmail());
        enrollment.setStudentId(enrollmentDto.getStudentId());
        enrollment.setDepartmentId(enrollmentDto.getDepartmentId());
        enrollment.setCourseId(enrollmentDto.getCourseId());
        enrollment.setEnrollmentDate(enrollmentDto.getEnrollmentDate());
        enrollment.setEnrollmentType(enrollmentDto.getEnrollmentType()); 
        enrollment.setEnrollmentState(enrollmentDto.getEnrollmentState()); 
        
        enrollment = enrollmentRepository.save(enrollment);

        return new EnrollmentDto(
            enrollment.getId(),
            enrollment.getName(),
            enrollment.getEmail(),
            enrollment.getStudentId(),
            enrollment.getDepartmentId(),
            enrollment.getCourseId(),
            enrollment.getEnrollmentDate(), 
            enrollment.getEnrollmentType(),  
            enrollment.getEnrollmentState() 
        );
    }

    @Override
    public EnrollmentDto updateEnrollment(EnrollmentDto enrollmentDto) {
        // Find the enrollment by its ID
        Enrollment enrollment = enrollmentRepository.findById(enrollmentDto.getEnrollmentId())
                .orElseThrow(() -> new RuntimeException("Enrollment not found for id: " + enrollmentDto.getEnrollmentId()));
        
        // Update the enrollment details
        enrollment.setName(enrollmentDto.getName());
        enrollment.setEmail(enrollmentDto.getEmail());
        enrollment.setStudentId(enrollmentDto.getStudentId());
        enrollment.setDepartmentId(enrollmentDto.getDepartmentId());
        enrollment.setCourseId(enrollmentDto.getCourseId());
        enrollment.setEnrollmentDate(enrollmentDto.getEnrollmentDate()); 
        enrollment.setEnrollmentType(enrollmentDto.getEnrollmentType()); 
        enrollment.setEnrollmentState(enrollmentDto.getEnrollmentState()); 
        
        enrollmentRepository.save(enrollment);
        
        // Return the updated enrollment details
        return new EnrollmentDto(
            enrollment.getId(),
            enrollment.getName(),
            enrollment.getEmail(),
            enrollment.getStudentId(),
            enrollment.getDepartmentId(),
            enrollment.getCourseId(),
            enrollment.getEnrollmentDate(), 
            enrollment.getEnrollmentType(),  
            enrollment.getEnrollmentState()  
        );
    }

    @Override
    public String deleteEnrollment(Long enrollmentId) {
        // Find the enrollment by its ID
        Enrollment enrollment = enrollmentRepository.findById(enrollmentId)
                .orElseThrow(() -> new RuntimeException("Enrollment not found for id: " + enrollmentId));

        // Delete the enrollment record
        enrollmentRepository.delete(enrollment);

        return "Enrollment deleted successfully.";
    }
}
