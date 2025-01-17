package com.higheredu.app.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.higheredu.app.dto.CourseDto;
import com.higheredu.app.model.Course;
import com.higheredu.app.repository.CourseRepository;
import com.higheredu.app.service.CourseService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public CourseDto getCourseById(Long courseId) {
        Course course = courseRepository.findById(courseId)
                .orElseThrow();
        return mapToCourseDto(course);
    }

    @Override
    public List<CourseDto> getAllCourses() {
        List<Course> courses = courseRepository.findAll();
        return courses.stream()
                .map(this::mapToCourseDto)
                .collect(Collectors.toList());
    }

    @Override
    public Course updateCourse(Long courseId, Course courseDetails) {
        Course course = courseRepository.findById(courseId)
                .orElseThrow();

        course.setCourseName(courseDetails.getCourseName());
        course.setCourseCode(courseDetails.getCourseCode());
        course.setDescription(courseDetails.getDescription());
        course.setCourseType(courseDetails.getCourseType());
        course.setCourseState(courseDetails.getCourseState());
        course.setTitle(courseDetails.getTitle());

        return courseRepository.save(course);
    }

    @Override
    public void deleteCourseById(Long courseId) {
        Course course = courseRepository.findById(courseId)
                .orElseThrow();
        courseRepository.delete(course);
    }

    private CourseDto mapToCourseDto(Course course) {
        CourseDto courseDto = new CourseDto();
        courseDto.setId(course.getId());
        courseDto.setCourseName(course.getCourseName());
        courseDto.setCourseCode(course.getCourseCode());
        courseDto.setDescription(course.getDescription());
        courseDto.setCourseType(course.getCourseType()); 
        courseDto.setCourseState(course.getCourseState());
        courseDto.setTitle(course.getTitle()); 
        return courseDto;
    }
}
