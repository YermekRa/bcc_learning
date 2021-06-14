package kz.bcc.tutorial.balatime.controller.admin;

import io.swagger.annotations.ApiOperation;
import kz.bcc.tutorial.balatime.model.EduYear;
import kz.bcc.tutorial.balatime.model.dto.teacher.SchedulerRow;
import kz.bcc.tutorial.balatime.service.admin.TeacherSchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/scheduler/teacher", produces = APPLICATION_JSON_VALUE)
public class TeacherSchedulerController {
    @Autowired
    TeacherSchedulerService teacherSchedulerService;

    @ApiOperation(value = "Get SchedulerRow map")
    @GetMapping("/all")
    public ResponseEntity<List<SchedulerRow>> getAll(
            @RequestParam EduYear eduYear,
            Principal principal
    ) {
        return ResponseEntity.ok(teacherSchedulerService.getAll(principal.getName(), eduYear));
    }
}
