package kz.bcc.tutorial.balatime.controller.admin;

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

    @ApiOperation(value = "Get All grades")
    @GetMapping("/all")
    public List<Grade> getAll(){
        return gradeService.getAll();
    }

    @ApiOperation(value = "Get grade by Id")
    @GetMapping("/id/{id}")
    public Grade getGradeById(@PathVariable Integer id){
        return gradeService.getById(id);
    }

    @ApiOperation(value = "Create or update grade object")
    @PostMapping()
    public Grade createGrade(@RequestBody Grade grade) {
        return gradeService.create(grade);
    }

    @ApiOperation(value = "Delete grade object")
    @DeleteMapping("/delete/{id}")
    public void deleteGrade(@PathVariable Integer id) {
        gradeService.deleteById(id);
    }
}
