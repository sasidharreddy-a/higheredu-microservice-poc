package com.higheredu_api.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.higheredu_api.student.model.Student;
import com.higheredu_api.student.repository.StudentRepository;
import com.higheredu_api.student.service.StudentService;

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
        return studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    @Override
    public Student updateStudent(Long studentId, Student student) {
        return studentRepository.findById(studentId).map(existingStudent -> {
            existingStudent.setFirstName(student.getFirstName());
            existingStudent.setLastName(student.getLastName());
            existingStudent.setEmail(student.getEmail());
            existingStudent.setTotalCharges(student.getTotalCharges());
            existingStudent.setTotalCredits(student.getTotalCredits());  
            return studentRepository.save(existingStudent);
        }).orElseThrow(() -> new RuntimeException("Student not found"));
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
