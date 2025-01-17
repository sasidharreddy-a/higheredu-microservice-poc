package com.higheredu.app.dto;



import com.higheredu.app.model.Department;
import com.higheredu.app.model.Enrollment;
import com.higheredu.app.model.Student;



public class ResponseDto {
	 private Department department;
	    private Student student;
	    private CourseDto course;
	    private Enrollment enrollment;


	    public ResponseDto() {}


		public Department getDepartment() {
			return department;
		}


		public void setDepartment(Department department) {
			this.department = department;
		}


		public Student getStudent() {
			return student;
		}


		public void setStudent(Student student) {
			this.student = student;
		}


		public CourseDto getCourse() {
			return course;
		}


		public void setCourse(CourseDto course) {
			this.course = course;
		}


		public Enrollment getEnrollment() {
			return enrollment;
		}


		public void setEnrollment(Enrollment enrollment) {
			this.enrollment = enrollment;
		}


		public ResponseDto(Department department, Student student, CourseDto course, Enrollment enrollment) {
			super();
			this.department = department;
			this.student = student;
			this.course = course;
			this.enrollment = enrollment;
		}

	   
    
    
}
