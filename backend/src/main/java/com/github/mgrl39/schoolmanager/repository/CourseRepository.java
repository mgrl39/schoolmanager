package com.github.mgrl39.schoolmanager.repository;

import com.github.mgrl39.schoolmanager.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CourseRepository {
    private final List<Course> courses = new ArrayList<>();

    public CourseRepository() {
        courses.add(new Course(1L, "A"));
        courses.add(new Course(2L, "B"));
        courses.add(new Course(3L, "C"));
    }

    public List<Course> getCourses() {
        return courses;
    }

    public Optional<Course> findById(long id) {
        return courses.stream().filter(course -> course.id() == id).findFirst();
    }

    public Course save(Course course) {
        Optional<Course> existCourse = findById(course.id());
        if (existCourse.isPresent())
            courses.removeIf(c -> c.equals(course));
        courses.add(course);
        return (course);
    }

    public boolean deleteById(long id) {
        int sizeBefore = courses.size();
        courses.removeIf(c -> c.id() == id);
        return sizeBefore != courses.size();
    }
}
