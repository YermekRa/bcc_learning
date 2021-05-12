package kz.bcc.tutorial.balatime.service;

import kz.bcc.tutorial.balatime.model.Grade;

import java.util.List;

public interface GradeService {
    Grade create(Grade journal);

    Grade getById(Integer id);

    List<Grade> getAll();

    void delete(Integer id);
}
