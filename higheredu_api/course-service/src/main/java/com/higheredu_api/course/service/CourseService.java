package com.higheredu_api.course.service;

import com.higheredu_api.course.dto.CourseDto;
import com.higheredu_api.course.model.Course;

import java.util.List;

public interface CourseService {

    Course createCourse(Course course);

    CourseDto getCourseById(Long courseId);

    List<CourseDto> getAllCourses();

    Course updateCourse(Long courseId, Course course);

    void deleteCourseById(Long courseId);
}
