package kz.bcc.tutorial.balatime.controller.adminUser;

import io.swagger.annotations.ApiOperation;
import kz.bcc.tutorial.balatime.model.ClasssSubj;
import kz.bcc.tutorial.balatime.service.adminUser.ClasssSubjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/classssubj", produces = APPLICATION_JSON_VALUE)
public class ClasssSubjController {
    @Autowired
    private ClasssSubjService classsSubjService;


    @ApiOperation(value = "Get All records")
    @GetMapping("/all")
    public ResponseEntity<List<ClasssSubj>> getAll() {
        return ResponseEntity.ok(classsSubjService.getAll());
    }

    @ApiOperation(value = "Create or update journal object")
    @PostMapping()
    public ResponseEntity<ClasssSubj> calculateTestObject(@RequestBody ClasssSubj classsSubj) {
        return ResponseEntity.ok(classsSubjService.create(classsSubj));
    }
    @ApiOperation(value = "Get journal by Id")
    @GetMapping("/id/{id}")
    public ResponseEntity<ClasssSubj> getTeacherById(@PathVariable Integer id) {
        return ResponseEntity.ok(classsSubjService.getById(id));
    }

    @ApiOperation(value = "Delete journal by Id")
    @DeleteMapping("/id/{id}")
    public void deleteJournalById(@PathVariable Integer id) {
        classsSubjService.delete(id);
    }
}
