package kz.bcc.tutorial.balatime.service.student;

import kz.bcc.tutorial.balatime.model.EduYear;
import kz.bcc.tutorial.balatime.model.dto.studentUser.StudentTimeTableRow;

import java.util.List;

public interface StudentTimeTableService {
    List<StudentTimeTableRow> getAll(Integer classs, EduYear eduYear);
}
