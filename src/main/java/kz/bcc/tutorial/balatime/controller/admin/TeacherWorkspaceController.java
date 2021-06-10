package kz.bcc.tutorial.balatime.controller.admin;

import io.swagger.annotations.ApiOperation;
import kz.bcc.tutorial.balatime.model.dto.teacher.WorkspaceRow;
import kz.bcc.tutorial.balatime.service.admin.TeacherWorkspaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/workspace/teacher", produces = APPLICATION_JSON_VALUE)
public class TeacherWorkspaceController {
    @Autowired
    TeacherWorkspaceService teacherWorkspaceService;

    @ApiOperation(value = "Get SchedulerRow map")
    @GetMapping("/all/teacherId/{teacherId}")
    public ResponseEntity<List<WorkspaceRow>> getAll(
            @PathVariable Integer teacherId
    ) {
        return ResponseEntity.ok(teacherWorkspaceService.getAll(teacherId));
    }
}
