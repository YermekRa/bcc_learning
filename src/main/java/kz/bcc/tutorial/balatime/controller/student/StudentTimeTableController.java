package kz.bcc.tutorial.balatime.controller.student;

import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import kz.bcc.tutorial.balatime.model.EduYear;
import kz.bcc.tutorial.balatime.model.dto.studentUser.StudentTimeTableRow;
import kz.bcc.tutorial.balatime.model.dto.teacher.SchedulerRow;
import kz.bcc.tutorial.balatime.service.student.StudentTimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/student/timetable", produces = APPLICATION_JSON_VALUE)
public class StudentTimeTableController {

    @Autowired
    private StudentTimeTableService studentTimeTableService;

    /*@ApiOperation(value = "Get All records")
    @GetMapping("/all")
    public List<StudentTimeTableRow> getAll() {
        return studentTimeTableService.getAll();
    }
*/
    @GetMapping("/all/classsId/{classsId}")
    public List<StudentTimeTableRow> getAll(
            @PathVariable Integer classsId,
            @RequestParam EduYear eduYear
    ) {
        return studentTimeTableService.getAll(classsId, eduYear);
    }

}

