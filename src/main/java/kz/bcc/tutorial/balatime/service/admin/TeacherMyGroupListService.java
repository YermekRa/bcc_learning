package kz.bcc.tutorial.balatime.service.admin;

import kz.bcc.tutorial.balatime.model.dto.teacher.MyGroupListRow;


import java.util.List;

public interface TeacherMyGroupListService {
     List<MyGroupListRow> getAll(String username);
}
