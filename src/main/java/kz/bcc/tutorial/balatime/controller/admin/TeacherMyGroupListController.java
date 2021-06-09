package kz.bcc.tutorial.balatime.controller.admin;

import io.swagger.annotations.ApiOperation;
import kz.bcc.tutorial.balatime.model.dto.MyGroupListRow;

import kz.bcc.tutorial.balatime.service.admin.TeacherMyGroupListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/mygrouplist/teacher", produces = APPLICATION_JSON_VALUE)
public class TeacherMyGroupListController {
    @Autowired
    TeacherMyGroupListService teacherMyGroupListService;

    @ApiOperation(value = "Get SchedulerRow map")
    @GetMapping("/all/teacherId/{teacherId}")
    public ResponseEntity<List<MyGroupListRow>> getAll(
            @PathVariable Integer teacherId
    ) {
        return ResponseEntity.ok(teacherMyGroupListService.getAll(teacherId));
    }
}
