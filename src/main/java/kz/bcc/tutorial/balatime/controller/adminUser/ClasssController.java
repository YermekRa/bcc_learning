package kz.bcc.tutorial.balatime.controller.adminUser;

import io.swagger.annotations.ApiOperation;
import kz.bcc.tutorial.balatime.model.Classs;
import kz.bcc.tutorial.balatime.service.adminUser.ClasssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/classs", produces = APPLICATION_JSON_VALUE)
public class ClasssController {
    @Autowired
    private ClasssService classsService;


    @ApiOperation(value = "Get All records")
    @GetMapping("/all")
    public ResponseEntity<List<Classs>> getAll() {
        return ResponseEntity.ok(classsService.getAll());
    }

    @ApiOperation(value = "Create or update journal object")
    @PostMapping()
    public ResponseEntity<Classs> calculateTestObject(@RequestBody Classs classs) {
        return ResponseEntity.ok(classsService.create(classs));
    }
    @ApiOperation(value = "Get classs by Id")
    @GetMapping("/id/{id}")
    public ResponseEntity<Classs> getTeacherById(@PathVariable Integer id) {
        return ResponseEntity.ok(classsService.getById(id));
    }

    @ApiOperation(value = "Delete classs by Id")
    @DeleteMapping("/id/{id}")
    public void deleteJournalById(@PathVariable Integer id) {
        classsService.delete(id);
    }
}
