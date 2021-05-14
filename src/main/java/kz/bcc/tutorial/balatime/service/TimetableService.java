package kz.bcc.tutorial.balatime.service;

import kz.bcc.tutorial.balatime.model.Timetable;

import java.util.List;

public interface TimetableService {
    Timetable create(Timetable timetable);

    Timetable getById(Integer id);

    List<Timetable> getAll();

    void delete(Integer id);
}
