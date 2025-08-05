package com.github.mgrl39.schoolmanager.repository;

import com.github.mgrl39.schoolmanager.model.Teacher;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class TeacherRepository {
    private final List<Teacher> teachers = new ArrayList<>();

    public TeacherRepository() {
        teachers.add(new Teacher(1L, "Pepe", "Lopez","pepe@gmail.com", "12312323P", "666122612"));
        teachers.add(new Teacher(2L, "Lopez", "Lopez","lopez@gmail.com", "12312323P", "666122612"));
        teachers.add(new Teacher(3L, "Pepe", "Pepe","pelo@gmail.com", "12312323P12", "666122612"));
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public Optional<Teacher> findById(long id) {
        return teachers.stream().filter(teacher -> teacher.id() == id).findFirst();
    }

    public Teacher save(Teacher teacher) {
        Optional<Teacher> existTeacher = this.findById(teacher.id());
        if (existTeacher.isPresent())
            teachers.removeIf(teach -> teach.equals(teacher));
        teachers.add(teacher);
        return (teacher);
    }

    public boolean deleteyById(long id) {
        int sizeBefore = teachers.size();
        teachers.removeIf(teach -> teach.id() == id);
        return sizeBefore != teachers.size();
    }

}
