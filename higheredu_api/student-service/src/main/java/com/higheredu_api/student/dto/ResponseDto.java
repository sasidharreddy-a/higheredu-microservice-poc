package com.higheredu_api.student.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {
    private DepartmentDto department;
    private StudentDto student;
    private CourseDto course;
	
  	public CourseDto getCourse() {
  		return course;
  	}
  	public void setCourse(CourseDto course) {
  		this.course = course;
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
    
    
}
