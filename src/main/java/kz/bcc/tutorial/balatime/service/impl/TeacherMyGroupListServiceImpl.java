package kz.bcc.tutorial.balatime.service.impl;

import kz.bcc.tutorial.balatime.model.Timetable;
import kz.bcc.tutorial.balatime.model.dto.teacher.LessonItem;
import kz.bcc.tutorial.balatime.model.dto.teacher.MyGroupListRow;

import kz.bcc.tutorial.balatime.repository.TimetableRepository;
import kz.bcc.tutorial.balatime.service.admin.TeacherMyGroupListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeacherMyGroupListServiceImpl implements TeacherMyGroupListService {
        @Autowired
        TimetableRepository timetableRepository;

        @Override
        public List<MyGroupListRow> getAll(Integer teacherId) {
            List<MyGroupListRow> myGroupListTable = new ArrayList<>();
            DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
            for (int i = 0; i < 10; i++) {

                List<Timetable> timetableListByOrder = timetableRepository.findAllByTeacherIdAndDayOfWeek(teacherId, dayOfWeek);
                MyGroupListRow myGroupListRow = new MyGroupListRow();
                myGroupListRow.setLesson( objectMapperDto(timetableListByOrder,dayOfWeek));

                myGroupListTable.add(myGroupListRow);
            }


            return myGroupListTable;
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
                lessonItem.setTeacherln(timetable.getTeacher().getLastName());
                lessonItem.setFree(false);
            } else {
                lessonItem.setClassRoom("");
                lessonItem.setGroup("");
                lessonItem.setName("Записи нет");
                lessonItem.setTeacher("");
                lessonItem.setFree(true);
            }
            return lessonItem;

        }
    }
