package com.github.mgrl39.schoolmanager.controller;

import com.github.mgrl39.schoolmanager.model.Student;
import com.github.mgrl39.schoolmanager.service.StudentService;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    public Optional<Student> getStudentyId(long id) {
        return studentService.getStudentById(id);
    }

    public Student saveStudent(Student student) {
        return studentService.saveStudent(student);
    }

    public boolean deleteStudentById(long id) {
        return studentService.deleteStudent(id);
    }
}
