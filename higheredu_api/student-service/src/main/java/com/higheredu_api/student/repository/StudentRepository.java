package com.higheredu_api.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.higheredu_api.student.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
