package kz.bcc.tutorial.balatime.service;

import kz.bcc.tutorial.balatime.model.Journal;

import java.util.List;

public interface JournalService {
    Journal create(Journal journal);

    Journal getById(Integer id);

    List<Journal> getAll();

    void delete(Integer id);
}
