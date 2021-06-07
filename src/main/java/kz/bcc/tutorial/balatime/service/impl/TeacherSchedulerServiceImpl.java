package kz.bcc.tutorial.balatime.service.impl;

import kz.bcc.tutorial.balatime.model.dto.LessonItem;
import kz.bcc.tutorial.balatime.model.dto.SchedulerRow;
import kz.bcc.tutorial.balatime.service.TeacherSchedulerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherSchedulerServiceImpl implements TeacherSchedulerService {

    @Override
    public List<SchedulerRow> getAll(Integer teacherId, Integer year, Integer month, Integer day) {
        List<SchedulerRow> answer = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            SchedulerRow schedulerRow = new SchedulerRow();
            schedulerRow.setTime((i+8)+":55");
            LessonItem l1 = new LessonItem();
            l1.setTeacher("teacher l1"+1);
            l1.setGroup("group l1"+1);
            l1.setName("name l1"+1);
            l1.setClassRoom("classroom l1"+1);
            schedulerRow.setL1(l1);
            LessonItem l2 = new LessonItem();
            l2.setTeacher("teacher l1"+1);
            l2.setGroup("group l1"+1);
            l2.setName("name l1"+1);
            l2.setClassRoom("classroom l1"+1);
            schedulerRow.setL2(l2);
            LessonItem l3 = new LessonItem();
            l3.setTeacher("teacher l1"+1);
            l3.setGroup("group l1"+1);
            l3.setName("name l1"+1);
            l3.setClassRoom("classroom l1"+1);
            schedulerRow.setL3(l3);
            LessonItem l4 = new LessonItem();
            l4.setTeacher("teacher l1"+1);
            l4.setGroup("group l1"+1);
            l4.setName("name l1"+1);
            l4.setClassRoom("classroom l1"+1);
            schedulerRow.setL4(l4);
            LessonItem l5 = new LessonItem();
            l5.setTeacher("teacher l1"+1);
            l5.setGroup("group l1"+1);
            l5.setName("name l1"+1);
            l5.setClassRoom("classroom l1"+1);
            schedulerRow.setL5(l5);
            answer.add(schedulerRow);

        }
        return answer;
    }
}
