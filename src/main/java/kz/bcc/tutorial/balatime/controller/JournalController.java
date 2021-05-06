package kz.bcc.tutorial.balatime.controller;

import io.swagger.annotations.ApiOperation;
import kz.bcc.tutorial.balatime.model.Journal;
import kz.bcc.tutorial.balatime.service.JournalService;
import kz.bcc.tutorial.balatime.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/journal", produces = APPLICATION_JSON_VALUE)
public class JournalController {
    @Autowired
    private JournalService journalService;


    @ApiOperation(value = "Get All journal")
    @GetMapping("/all")
    public ResponseEntity<List<Journal>> getAll() {
        return ResponseEntity.ok(journalService.getAll());
    }

    @ApiOperation(value = "Create or update journal object")
    @PostMapping()
    public ResponseEntity<Journal> calculateTestObject(@RequestBody Journal journal) {
        return ResponseEntity.ok(journalService.create(journal));
    }
    @ApiOperation(value = "Get All journal")
    @GetMapping("/id/{id}")
    public ResponseEntity<Journal> getTeacherById(@PathVariable Integer id) {
        return ResponseEntity.ok(journalService.getById(id));
    }
}
