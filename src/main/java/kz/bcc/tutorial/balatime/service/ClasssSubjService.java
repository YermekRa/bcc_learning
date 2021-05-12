package kz.bcc.tutorial.balatime.service;

import kz.bcc.tutorial.balatime.model.ClasssSubj;

import java.util.List;

public interface ClasssSubjService {
    ClasssSubj create(ClasssSubj classsSubj);

    ClasssSubj getById(Integer id);

    List<ClasssSubj> getAll();

    void delete(Integer id);
}
