package kz.bcc.tutorial.balatime.service.teacher;

import kz.bcc.tutorial.balatime.model.dto.teacher.journal.TeacherJournalDto;

import java.time.DayOfWeek;
import java.util.List;

public interface TeacherJournalService {
    List<TeacherJournalDto> getLesson ();
}
