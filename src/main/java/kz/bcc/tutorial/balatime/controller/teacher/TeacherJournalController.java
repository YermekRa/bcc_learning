package kz.bcc.tutorial.balatime.controller.teacher;

import io.swagger.annotations.ApiOperation;
import kz.bcc.tutorial.balatime.model.dto.teacher.journal.TeacherJournalDto;
import kz.bcc.tutorial.balatime.service.teacher.TeacherJournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.DayOfWeek;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/teacher/journal", produces = APPLICATION_JSON_VALUE)
public class TeacherJournalController {
    @Autowired
    TeacherJournalService teacherJournalService;

    @ApiOperation(value = "Get SchedulerRow map")
    @GetMapping("/all/teacherId/{teacherId}")
    public ResponseEntity<List<TeacherJournalDto>> getAll(


    ) {
        return ResponseEntity.ok(teacherJournalService.getLesson());
    }
}
