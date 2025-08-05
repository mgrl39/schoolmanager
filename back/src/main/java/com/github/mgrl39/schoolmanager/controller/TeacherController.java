package com.github.mgrl39.schoolmanager.controller;

import com.github.mgrl39.schoolmanager.service.TeacherService;
import com.github.mgrl39.schoolmanager.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class TeacherController {
    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    public Optional<Teacher> getTeacherId(long id) {
        return teacherService.getTeacherById(id);
    }

    public Teacher saveTeacher(Teacher teacher) {
        return teacherService.saveTeacher(teacher);
    }

    public boolean deleteTeacherById(long id) {
        return teacherService.deleteTeacher(id);
    }

}