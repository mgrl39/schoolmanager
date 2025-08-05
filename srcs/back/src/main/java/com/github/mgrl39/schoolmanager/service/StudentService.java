package com.github.mgrl39.schoolmanager.service;

import com.github.mgrl39.schoolmanager.model.Student;
import com.github.mgrl39.schoolmanager.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.getStudents();
    }

    public Optional<Student> getStudentById(long id) {
        return studentRepository.findById(id);
    }

    public boolean deleteStudent(long id) {
        return studentRepository.deleteyById(id);
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
