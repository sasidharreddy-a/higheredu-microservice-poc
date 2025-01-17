package com.higheredu_api.enrollment.dto;

public class ResponseDto {
    private DepartmentDto department;
    private StudentDto student;
    private CourseDto course;
    private EnrollmentDto enrollment;


    public ResponseDto() {}

    public ResponseDto(DepartmentDto department, StudentDto student, CourseDto course, EnrollmentDto enrollment) {
        this.department = department;
        this.student = student;
        this.course = course;
        this.enrollment = enrollment;
    }

    public DepartmentDto getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDto department) {
        this.department = department;
    }

    public StudentDto getStudent() {
        return student;
    }

    public void setStudent(StudentDto student) {
        this.student = student;
    }

    public CourseDto getCourse() {
        return course;
    }

    public void setCourse(CourseDto course) {
        this.course = course;
    }

    public EnrollmentDto getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(EnrollmentDto enrollment) {
        this.enrollment = enrollment;
    }
}
