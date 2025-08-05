package com.github.mgrl39.schoolmanager.service;

import com.github.mgrl39.schoolmanager.model.Course;
import com.github.mgrl39.schoolmanager.repository.CourseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
       this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourse() {
        return courseRepository.getCourses();
    }

    public Optional<Course> getCourseId(long id) {
        return courseRepository.findById(id);
    }

    public boolean deleteStudent(long id) {
        return courseRepository.deleteById(id);
    }

    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }
}
