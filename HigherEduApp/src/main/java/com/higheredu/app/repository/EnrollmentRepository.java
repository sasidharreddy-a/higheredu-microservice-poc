package com.higheredu.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.higheredu.app.model.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
