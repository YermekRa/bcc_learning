package kz.bcc.tutorial.balatime.service.student;

import kz.bcc.tutorial.balatime.model.dto.studentUser.StudentProgressListDto;

import java.util.List;

public interface StudentProgressListService {
    List<StudentProgressListDto> getAll(Integer studentId);
}
