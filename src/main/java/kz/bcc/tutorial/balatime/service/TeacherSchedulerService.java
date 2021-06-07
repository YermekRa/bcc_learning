package kz.bcc.tutorial.balatime.service;

import kz.bcc.tutorial.balatime.model.dto.SchedulerRow;

import java.util.List;

public interface TeacherSchedulerService {
     List<SchedulerRow> getAll(Integer teacherId, Integer year, Integer month, Integer day);
}
