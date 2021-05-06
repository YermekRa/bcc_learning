package kz.bcc.tutorial.balatime.service;

import kz.bcc.tutorial.balatime.model.Student;

import java.util.List;

public interface StudentService {
    Student create(Student student);

    Student getById(Integer id);

    List<Student> getAll();

    void delete(Integer id);
}
