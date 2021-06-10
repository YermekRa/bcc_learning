package kz.bcc.tutorial.balatime.controller.admin;

import io.swagger.annotations.ApiOperation;
import kz.bcc.tutorial.balatime.model.Grade;
import kz.bcc.tutorial.balatime.model.dto.studentUser.StudentHTDLItem;
import kz.bcc.tutorial.balatime.model.dto.studentUser.StudentLessons;
import kz.bcc.tutorial.balatime.service.admin.StudentWSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/student/ws", produces = APPLICATION_JSON_VALUE)
public class StudentWSController {
    @Autowired
    StudentWSService studentWSService;

    @ApiOperation(value = "Get hot data")
    @GetMapping("/hot/studentId/{studentId}")
    public ResponseEntity<List<StudentHTDLItem>> getHotData(@PathVariable Integer studentId) {

        return ResponseEntity.ok(studentWSService.getHotData(studentId));
    }

    @ApiOperation(value = "Get my cources")
    @GetMapping("/myCources/studentId/{studentId}")
    public ResponseEntity<List<StudentLessons>> getMyCources(@PathVariable Integer studentId){
        return ResponseEntity.ok(studentWSService.getMyCources(studentId));
    }
}
