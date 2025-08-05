package com.github.mgrl39.schoolmanager.service;

import com.github.mgrl39.schoolmanager.model.Teacher;
import com.github.mgrl39.schoolmanager.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.getTeachers();
    }

    public Optional<Teacher> getTeacherById(long id) {
        return teacherRepository.findById(id);
    }

    public boolean deleteTeacher(long id) {
        return teacherRepository.deleteyById(id);
    }

    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }


}
