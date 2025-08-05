package com.github.mgrl39.schoolmanager.resource;

import com.github.mgrl39.schoolmanager.controller.CourseController;
import com.github.mgrl39.schoolmanager.model.Course;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v0/courses")
public class CourseResource {
    private final CourseController courseController;

    public CourseResource(CourseController courseController) {
        this.courseController = courseController;
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return courseController.getAllCourse();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable long id) {
        return courseController.getCourseId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Course createCourse(@RequestBody Course course) {
        return courseController.saveCourse(course);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable long id) {
        return (courseController.deleteCourseById(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build());
        // deleted ? 204 (No Content) : 404 (Not Found)
    }
}
