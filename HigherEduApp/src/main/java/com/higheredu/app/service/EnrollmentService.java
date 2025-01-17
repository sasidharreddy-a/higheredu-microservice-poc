package com.higheredu.app.service;

import com.higheredu.app.dto.EnrollmentDto;
import com.higheredu.app.dto.ResponseDto;

public interface EnrollmentService {
    String deleteEnrollment(Long enrollmentId);

	ResponseDto getEnrollment(Long enrollmentId);

	EnrollmentDto saveEnrollment(EnrollmentDto enrollmentDto);

	EnrollmentDto updateEnrollment(EnrollmentDto enrollmentDto);
}
