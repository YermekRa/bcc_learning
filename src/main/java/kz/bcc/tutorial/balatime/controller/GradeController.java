package kz.bcc.tutorial.balatime.controller;

import io.swagger.annotations.ApiOperation;
import kz.bcc.tutorial.balatime.model.Grade;
import kz.bcc.tutorial.balatime.service.adminUser.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/grade", produces = APPLICATION_JSON_VALUE)
public class GradeController {
    @Autowired
    private GradeService gradeService;


    @ApiOperation(value = "Get All records")
    @GetMapping("/all")
    public ResponseEntity<List<Grade>> getAll() {
        return ResponseEntity.ok(gradeService.getAll());
    }

    @ApiOperation(value = "Create or update journal object")
    @PostMapping()
    public ResponseEntity<Grade> calculateTestObject(@RequestBody Grade grade) {
        return ResponseEntity.ok(gradeService.create(grade));
    }
    @ApiOperation(value = "Get grade by Id")
    @GetMapping("/id/{id}")
    public ResponseEntity<Grade> getTeacherById(@PathVariable Integer id) {
        return ResponseEntity.ok(gradeService.getById(id));
    }

    @ApiOperation(value = "Delete grade by Id")
    @DeleteMapping("/id/{id}")
    public void deleteJournalById(@PathVariable Integer id) {
        gradeService.delete(id);
    }
}
