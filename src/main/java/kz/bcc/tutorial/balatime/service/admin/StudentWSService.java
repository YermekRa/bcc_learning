package kz.bcc.tutorial.balatime.service.admin;

import kz.bcc.tutorial.balatime.model.dto.studentUser.StudentHTDLItem;
import kz.bcc.tutorial.balatime.model.dto.studentUser.StudentLessons;

import java.util.List;

public interface StudentWSService {
    List<StudentHTDLItem> getHotData(Integer studentId);

    List<StudentLessons> getMyCources(Integer studentId);

}


