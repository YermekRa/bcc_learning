package kz.bcc.tutorial.balatime.service.adminUser;

import kz.bcc.tutorial.balatime.model.TeacherSubj;

import java.util.List;

public interface TeacherSubjService {
    TeacherSubj create(TeacherSubj journal);

    TeacherSubj getById(Integer id);

    List<TeacherSubj> getAll();

    void delete(Integer id);
}
