package kz.bcc.tutorial.balatime.service.adminUser;

import kz.bcc.tutorial.balatime.model.Timetable;
import org.springframework.data.domain.Page;

import java.util.List;

public interface TimetableService {
    Timetable create(Timetable timetable);

    Timetable getById(Integer id);

    List<Timetable> getAll();

    void delete(Integer id);

    Page<Timetable> getAllByPageAndSize(Integer page, Integer size);  //pagination
}
