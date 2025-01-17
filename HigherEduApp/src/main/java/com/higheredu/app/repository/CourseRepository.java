package com.higheredu.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.higheredu.app.model.Course;

import jakarta.transaction.Transactional;


@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE Course c SET c.courseCode = :courseCode, c.courseName = :courseName, c.description = :description WHERE c.id = :id")
    void updateCourse(@Param("courseCode") String courseCode, @Param("courseName") String courseName,
                      @Param("description") String description, @Param("id") Long id);
}
