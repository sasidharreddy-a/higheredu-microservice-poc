package com.higheredu_api.enrollment.service;

import com.higheredu_api.enrollment.dto.EnrollmentDto;
import com.higheredu_api.enrollment.dto.ResponseDto;

public interface EnrollmentService {
    ResponseDto getEnrollment(Long enrollmentId);
    EnrollmentDto saveEnrollment(EnrollmentDto enrollmentDto);
    EnrollmentDto updateEnrollment(EnrollmentDto enrollmentDto);
    String deleteEnrollment(Long enrollmentId);
}
