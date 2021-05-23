package kz.bcc.tutorial.balatime.controller;

import io.swagger.annotations.ApiOperation;
import kz.bcc.tutorial.balatime.model.Subject;
import kz.bcc.tutorial.balatime.service.adminUser.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/subject", produces = APPLICATION_JSON_VALUE)
public class SubjectController {
    @Autowired
    private SubjectService subjectService;


    @ApiOperation(value = "Get All records")
    @GetMapping("/all")
    public ResponseEntity<List<Subject>> getAll() {
        return ResponseEntity.ok(subjectService.getAll());
    }

    @ApiOperation(value = "Create or update subject object")
    @PostMapping()
    public ResponseEntity<Subject> calculateTestObject(@RequestBody Subject subject) {
        return ResponseEntity.ok(subjectService.create(subject));
    }
    @ApiOperation(value = "Get subject by Id")
    @GetMapping("/id/{id}")
    public ResponseEntity<Subject> getTeacherById(@PathVariable Integer id) {
        return ResponseEntity.ok(subjectService.getById(id));
    }

    @ApiOperation(value = "Delete subject by Id")
    @DeleteMapping("/id/{id}")
    public void deleteJournalById(@PathVariable Integer id) {
        subjectService.delete(id);
    }
}
