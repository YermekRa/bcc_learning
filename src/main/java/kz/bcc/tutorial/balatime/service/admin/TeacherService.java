package kz.bcc.tutorial.balatime.service.admin;

import kz.bcc.tutorial.balatime.model.Teacher;

import java.util.List;

public interface TeacherService {
    Teacher create(Teacher teacher);

    Teacher getById(Integer id);

    List<Teacher> getAll();

    void delete(Integer id);
}
