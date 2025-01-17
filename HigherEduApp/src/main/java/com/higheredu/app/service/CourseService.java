package com.higheredu.app.service;

import java.util.List;

import com.higheredu.app.dto.CourseDto;
import com.higheredu.app.model.Course;

public interface CourseService {

	 Course createCourse(Course course);

	    CourseDto getCourseById(Long courseId);

	    List<CourseDto> getAllCourses();

	    Course updateCourse(Long courseId, Course course);

	    void deleteCourseById(Long courseId);
}
