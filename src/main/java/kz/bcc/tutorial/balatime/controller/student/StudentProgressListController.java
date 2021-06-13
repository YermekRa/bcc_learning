package kz.bcc.tutorial.balatime.controller.student;

import kz.bcc.tutorial.balatime.model.dto.studentUser.StudentProgressListDto;
import kz.bcc.tutorial.balatime.model.dto.studentUser.StudentTimeTableRow;
import kz.bcc.tutorial.balatime.service.student.StudentProgressListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/student/progressList", produces = APPLICATION_JSON_VALUE)
public class StudentProgressListController {

    @Autowired
    private StudentProgressListService studentProgressListService;

    @GetMapping("/studentId/{studentId}")
    public List<StudentProgressListDto> getAll(
            @PathVariable Integer studentId
    ) {
        return studentProgressListService.getAll(studentId);
    }
}
