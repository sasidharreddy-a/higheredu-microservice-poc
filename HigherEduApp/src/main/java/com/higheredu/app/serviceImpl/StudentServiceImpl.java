package com.higheredu.app.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.higheredu.app.model.Student;
import com.higheredu.app.repository.StudentRepository;
import com.higheredu.app.service.StudentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

	@Autowired
    private StudentRepository studentRepository;


    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudent(Long studentId) {
        return studentRepository.findById(studentId).orElseThrow(null);
    }

    
    @Override
    public Student updateStudent(Long studentId, Student student) {
        return studentRepository.findById(studentId).map(existingStudent -> {
            // Update existing student
            existingStudent.setFirstName(student.getFirstName());
            existingStudent.setLastName(student.getLastName());
            existingStudent.setEmail(student.getEmail());
            // Any other fields to be updated
            return studentRepository.save(existingStudent);
        }).orElse(null);
    }

    @Override
    public String deleteStudent(Long id) {
        if(studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return "Student deleted successfully.";
        }

        return "Student not found.";
    }

	
}
