package kz.bcc.tutorial.balatime.service.impl.teacher;

import kz.bcc.tutorial.balatime.model.Journal;
import kz.bcc.tutorial.balatime.model.dto.teacher.journal.TeacherJournalDto;
import kz.bcc.tutorial.balatime.repository.JournalRepository;
import kz.bcc.tutorial.balatime.repository.TimetableRepository;
import kz.bcc.tutorial.balatime.service.teacher.TeacherJournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherJournalServiceImpl implements TeacherJournalService {
    @Autowired
    TimetableRepository timetableRepository;
    @Autowired
    JournalRepository journalRepository;

    @Override
    public List<TeacherJournalDto> getLesson() {
        List<TeacherJournalDto> LessonTable = new ArrayList<>();
//        Integer timetableId = timetableRepository.findFirstByTeacherIdAndDayOfWeekAndSubject_order(teacherId, dayOfWeek, subjectOrd).getId();
//        List<Journal> journalList = journalRepository.findAllByTimeTableId(timetableId);
//        for (int i = 1; i<journalList.size(); i++){
//            TeacherJournalDto teacherJournalDto = new TeacherJournalDto();
//            Journal journal = journalList.get(i);
//            teacherJournalDto.setOrd(i);
//            teacherJournalDto.setStudent(journal.getStudent().getFirstName() + journal.getStudent().getLastName());
//            teacherJournalDto.setGrade(journal.getGrade());
//            teacherJournalDto.setPrim("prim");
//            LessonTable.add(teacherJournalDto);
//        }

        for (int i = 1; i<10; i++){
            TeacherJournalDto teacherJournalDto = new TeacherJournalDto();
//            Journal journal = new.get(i);
            teacherJournalDto.setOrd(i);
            teacherJournalDto.setStudent("student" + i);
            teacherJournalDto.setGrade("grade"+ i);
            teacherJournalDto.setPrim("prim" + i);
            LessonTable.add(teacherJournalDto);
        }
        return  LessonTable;
    }
}
