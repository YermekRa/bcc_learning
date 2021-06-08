package kz.bcc.tutorial.balatime.controller.admin;

import io.swagger.annotations.ApiOperation;
import kz.bcc.tutorial.balatime.model.EduYear;
import kz.bcc.tutorial.balatime.model.dto.SchedulerRow;
import kz.bcc.tutorial.balatime.service.TeacherSchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/scheduler/teacher", produces = APPLICATION_JSON_VALUE)
public class TeacherSchedulerController {
    @Autowired
    TeacherSchedulerService teacherSchedulerService;

    @ApiOperation(value = "Get SchedulerRow map")
    @GetMapping("/all/teacherId/{teacherId}")
    public ResponseEntity<List<SchedulerRow>> getAll(
            @PathVariable Integer teacherId,
            @RequestParam EduYear eduYear
    ) {
        return ResponseEntity.ok(teacherSchedulerService.getAll(teacherId, eduYear));
    }
}
