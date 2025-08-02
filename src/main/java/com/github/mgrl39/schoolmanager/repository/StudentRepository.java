package com.github.mgrl39.schoolmanager.repository;

import com.github.mgrl39.schoolmanager.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class StudentRepository {

    private final List<Student> students = new ArrayList<>();

    public StudentRepository() {
        students.add(new Student(1L, "Pepe", "Lopez","pepe@gmail.com", "12312323P", "666122612"));
        students.add(new Student(2L, "Lopez", "Lopez","lopez@gmail.com", "12312323P", "666122612"));
        students.add(new Student(3L, "Pepe", "Pepe","pelo@gmail.com", "12312323P12", "666122612"));
    }

    public List<Student> findAll() {
        return students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Optional<Student> findById(long id) {
        return students.stream().filter(student -> student.id() == id).findFirst();
    }

    public Student save(Student student) {
        Optional<Student> existStudent = findById(student.id());
        if (existStudent.isPresent())
            students.removeIf(stud -> stud.equals(student));
        students.add(student);
        return (student);
    }

    public boolean deleteyById(long id) {
        int sizeBefore = students.size();
        students.removeIf(student -> student.id() == id);
        return sizeBefore != students.size();
    }
}
