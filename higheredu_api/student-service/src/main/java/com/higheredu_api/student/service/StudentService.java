package com.higheredu_api.student.service;

import com.higheredu_api.student.model.Student;

public interface StudentService {
    Student saveStudent(Student student);

    Student getStudent(Long studentId);
    
    Student updateStudent(Long studentId, Student student);
    
    String deleteStudent(Long studentId);
}
