package kz.bcc.tutorial.balatime.service.admin;

import kz.bcc.tutorial.balatime.model.EduYear;
import kz.bcc.tutorial.balatime.model.dto.teacher.SchedulerRow;

import java.util.List;

public interface TeacherSchedulerService {
     List<SchedulerRow> getAll(Integer teacherId, EduYear eduYear);
}
