package com.github.mgrl39.schoolmanager.resource;

import com.github.mgrl39.schoolmanager.controller.StudentController;
import com.github.mgrl39.schoolmanager.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/v0/students")
public class StudentResource {
    private final StudentController studentController;

    @Autowired
    public StudentResource(StudentController studentController) {
        this.studentController = studentController;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentController.getAllStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable long id) {
        return studentController.getStudentyId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student) {
        return studentController.saveStudent(student);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable long id) {
        return (studentController.deleteStudentById(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build());
        // deleted ? 204 (No Content) : 404 (Not Found)
    }
}
