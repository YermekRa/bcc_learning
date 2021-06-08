package kz.bcc.tutorial.balatime.service.impl;

import kz.bcc.tutorial.balatime.model.EduYear;
import kz.bcc.tutorial.balatime.model.Timetable;
import kz.bcc.tutorial.balatime.model.dto.LessonItem;
import kz.bcc.tutorial.balatime.model.dto.SchedulerRow;
import kz.bcc.tutorial.balatime.repository.TimetableRepository;
import kz.bcc.tutorial.balatime.service.TeacherSchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TeacherSchedulerServiceImpl implements TeacherSchedulerService {
    @Autowired
    TimetableRepository timetableRepository;

    @Override
    public List<SchedulerRow> getAll(Integer teacherId, EduYear eduYear) {
        List<SchedulerRow> schedulerTable = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Integer subjectOrder = i + 1;
            List<Timetable> timetableListByOrder = timetableRepository.findAllByTeacherIdAndSubjectOrder(teacherId, subjectOrder);
            SchedulerRow schedulerRow = new SchedulerRow();
            schedulerRow.setTime((i + 8) + ":00");
            schedulerRow.setL1(objectMapperDto(timetableListByOrder, DayOfWeek.MONDAY));
            schedulerRow.setL2(objectMapperDto(timetableListByOrder, DayOfWeek.TUESDAY));
            schedulerRow.setL3(objectMapperDto(timetableListByOrder, DayOfWeek.WEDNESDAY));
            schedulerRow.setL4(objectMapperDto(timetableListByOrder, DayOfWeek.THURSDAY));
            schedulerRow.setL5(objectMapperDto(timetableListByOrder, DayOfWeek.FRIDAY));
            schedulerTable.add(schedulerRow);
        }


        return schedulerTable;
    }

    LessonItem objectMapperDto(List<Timetable> timetableListByOrder, DayOfWeek dayOfWeek) {

        LessonItem lessonItem = new LessonItem();
        Optional<Timetable> ot = timetableListByOrder.stream().filter(tt -> tt.getDayOfWeek().getValue() == dayOfWeek.getValue()).findFirst();
        if (ot.isPresent()) {
            Timetable timetable = ot.get();
            lessonItem.setClassRoom(timetable.getRoom().getCode() + ", " + timetable.getRoom().getName());
            lessonItem.setGroup(timetable.getClasss().getCode());
            lessonItem.setName(timetable.getSubject().getCode());
            lessonItem.setTeacher(timetable.getTeacher().getFirstName());
            lessonItem.setFree(false);
        } else {
            lessonItem.setClassRoom("");
            lessonItem.setGroup("");
            lessonItem.setName("empty");
            lessonItem.setTeacher("");
            lessonItem.setFree(true);
        }
        return lessonItem;

    }
}
