package com.higheredu_api.enrollment.dto;

import java.util.Date;

public class EnrollmentDto {
    private Long enrollmentId;
    private String name;
    private String email;
    private Long studentId;
    private Long departmentId;
    private Long courseId;
    private Date enrollmentDate;
    private String enrollmentType;
    private String enrollmentState;
    

    public EnrollmentDto() {}

    public EnrollmentDto(Long enrollmentId, String name, String email, Long studentId, Long departmentId, Long courseId, Date enrollmentDate, String enrollmentType, String enrollmentState) {
        this.enrollmentId = enrollmentId;
        this.name = name;
        this.email = email;
        this.studentId = studentId;
        this.departmentId = departmentId;
        this.courseId = courseId;
        this.enrollmentDate = enrollmentDate;
        this.enrollmentType = enrollmentType;
        this.enrollmentState = enrollmentState;
    }
    
    // Getters and Setters
    public Long getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(Long enrollmentId) {
        this.enrollmentId = enrollmentId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

	public Date getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public String getEnrollmentType() {
		return enrollmentType;
	}

	public void setEnrollmentType(String enrollmentType) {
		this.enrollmentType = enrollmentType;
	}

	public String getEnrollmentState() {
		return enrollmentState;
	}

	public void setEnrollmentState(String enrollmentState) {
		this.enrollmentState = enrollmentState;
	}
    
    
}
