package com.github.mgrl39.schoolmanager.controller;

import com.github.mgrl39.schoolmanager.model.Course;
import com.github.mgrl39.schoolmanager.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class CourseController {
    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    public List<Course> getAllCourse() {
        return courseService.getAllCourse();
    }

    public Optional<Course> getCourseId(long id) {
        return courseService.getCourseId(id);
    }

    public Course saveCourse(Course course) {
        return courseService.saveCourse(course);
    }

    public boolean deleteCourseById(long id) {
        return courseService.deleteStudent(id);
    }
}
