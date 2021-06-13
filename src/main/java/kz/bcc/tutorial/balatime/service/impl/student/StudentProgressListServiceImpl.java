package kz.bcc.tutorial.balatime.service.impl.student;

import kz.bcc.tutorial.balatime.model.Timetable;
import kz.bcc.tutorial.balatime.model.dto.studentUser.StudentProgressListDto;
import kz.bcc.tutorial.balatime.model.dto.studentUser.StudentTimeTableRow;
import kz.bcc.tutorial.balatime.service.student.StudentProgressListService;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentProgressListServiceImpl implements StudentProgressListService {
    @Override
    public List<StudentProgressListDto> getAll(Integer studentId) {
        List<StudentProgressListDto> studentProgressListDtoArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Integer subjectOrder = i + 1;
            StudentProgressListDto studentProgressListDto = new StudentProgressListDto();
            studentProgressListDto.setOrd(i);
            studentProgressListDto.setSubject("Subject"+i);
            studentProgressListDto.setHomework("Homework"+i);
            studentProgressListDto.setGrade("Grade"+i);
            studentProgressListDtoArrayList.add(studentProgressListDto);
        }


        return studentProgressListDtoArrayList;
    }
}
