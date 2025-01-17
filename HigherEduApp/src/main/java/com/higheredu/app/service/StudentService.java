package com.higheredu.app.service;

import com.higheredu.app.model.Student;

public interface StudentService {
    Student saveStudent(Student student);

    Student getStudent(Long studentId);
    
    
    String deleteStudent(Long studentId);

	Student updateStudent(Long studentId, Student student);
}
