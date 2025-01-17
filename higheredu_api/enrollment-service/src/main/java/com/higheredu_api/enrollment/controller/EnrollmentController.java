package com.higheredu_api.enrollment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.higheredu_api.enrollment.dto.EnrollmentDto;
import com.higheredu_api.enrollment.dto.ResponseDto;
import com.higheredu_api.enrollment.service.EnrollmentService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/enrollments")
@AllArgsConstructor
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;
    
    
    @PostMapping
    public ResponseEntity<EnrollmentDto> createEnrollment(@RequestBody EnrollmentDto enrollmentDto) {
        EnrollmentDto savedEnrollment = enrollmentService.saveEnrollment(enrollmentDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEnrollment);
    }

    @GetMapping("{enrollmentId}")
    public ResponseEntity<ResponseDto> getEnrollment(@PathVariable("enrollmentId") Long enrollmentId) {
        ResponseDto enrollmentResponse = enrollmentService.getEnrollment(enrollmentId);
        if (enrollmentResponse == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(enrollmentResponse);
    }

    @PutMapping
    public ResponseEntity<EnrollmentDto> updateEnrollment(@RequestBody EnrollmentDto enrollmentDto) {
        EnrollmentDto updatedEnrollment = enrollmentService.updateEnrollment(enrollmentDto);
        return ResponseEntity.ok(updatedEnrollment);
    }

    @DeleteMapping("{enrollmentId}")
    public ResponseEntity<Void> deleteEnrollment(@PathVariable("enrollmentId") Long enrollmentId) {
        String result = enrollmentService.deleteEnrollment(enrollmentId);
        if (result.equals("Enrollment deleted successfully.")) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}