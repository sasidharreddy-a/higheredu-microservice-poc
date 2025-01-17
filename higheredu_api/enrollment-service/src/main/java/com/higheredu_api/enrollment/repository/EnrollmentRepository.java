package com.higheredu_api.enrollment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.higheredu_api.enrollment.model.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
