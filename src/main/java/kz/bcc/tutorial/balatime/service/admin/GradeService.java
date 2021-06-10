package kz.bcc.tutorial.balatime.service.admin;

import kz.bcc.tutorial.balatime.model.Grade;

import java.util.List;

public interface GradeService {
    Grade getById(int id);
    Grade create(Grade grade);
    List<Grade> getAll();
    Grade getByCode(String code);
    void deleteById(Integer id);
}
