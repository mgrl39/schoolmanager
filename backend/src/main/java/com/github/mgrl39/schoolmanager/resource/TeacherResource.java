package com.github.mgrl39.schoolmanager.resource;

import com.github.mgrl39.schoolmanager.controller.TeacherController;
import com.github.mgrl39.schoolmanager.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v0/teachers")
public class TeacherResource {
    private final TeacherController teacherController;

    @Autowired
    public TeacherResource(TeacherController teacherController) {
        this.teacherController = teacherController;
    }

    @GetMapping
    public List<Teacher> getAllTeachers() {
        return teacherController.getAllTeachers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable long id) {
        return teacherController.getTeacherId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherController.saveTeacher(teacher);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTeacher(@PathVariable long id) {
        return (teacherController.deleteTeacherById(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build());
        // deleted ? 204 (No Content) : 404 (Not Found)
    }
}
