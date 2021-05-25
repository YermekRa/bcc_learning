package kz.bcc.tutorial.balatime.controller.adminUser;

import io.swagger.annotations.ApiOperation;
import kz.bcc.tutorial.balatime.model.TeacherSubj;
import kz.bcc.tutorial.balatime.service.adminUser.TeacherSubjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/teacherSubj", produces = APPLICATION_JSON_VALUE)
public class TeacherSubjController {
    @Autowired
    private  TeacherSubjService teacherSubjService;


    @ApiOperation(value = "Get All records")
    @GetMapping("/all")
    public ResponseEntity<List< TeacherSubj>> getAll() {
        return ResponseEntity.ok(teacherSubjService.getAll());
    }

    @ApiOperation(value = "Create or update teacherSubj object")
    @PostMapping()
    public ResponseEntity< TeacherSubj> calculateTestObject(@RequestBody  TeacherSubj teacherSubj) {
        return ResponseEntity.ok(teacherSubjService.create(teacherSubj));
    }
    @ApiOperation(value = "Get teacherSubj by Id")
    @GetMapping("/id/{id}")
    public ResponseEntity< TeacherSubj> getTeacherById(@PathVariable Integer id) {
        return ResponseEntity.ok(teacherSubjService.getById(id));
    }

    @ApiOperation(value = "Delete teacherSubj by Id")
    @DeleteMapping("/id/{id}")
    public void deleteJournalById(@PathVariable Integer id) {
        teacherSubjService.delete(id);
    }
}
