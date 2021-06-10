package kz.bcc.tutorial.balatime.controller.admin;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import kz.bcc.tutorial.balatime.model.CustomPagination;
import kz.bcc.tutorial.balatime.model.Subject;
import kz.bcc.tutorial.balatime.service.admin.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/subject", produces = APPLICATION_JSON_VALUE)
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @ApiOperation(value = "Get All subjects")
    @GetMapping("/all")
    public List<Subject> getAll() {
        return subjectService.getAll();
    }

    @ApiOperation(value = "Create or update subject object")
    @PostMapping()
    public Subject createSubject(@RequestBody Subject subject) {
        return subjectService.create(subject);
    }

    @ApiOperation(value = "Get subject by id")
    @GetMapping("/id/{id}")
    public Subject getSubjectById(@PathVariable Integer id) {
        return subjectService.getById(id);
    }

    @ApiOperation(value = "Delete grade object")
    @DeleteMapping("/delete/{id}")
    public void deleteSubject(@PathVariable Integer id) {
        subjectService.deleteById(id);
    }

    @GetMapping("/all/pagination")
    @ApiOperation(value = "Get all algorithm by pagination")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", dataType = "int", value = "№ страницы с которой нужно отображать.", paramType = "query"),
            @ApiImplicitParam(name = "size", dataType = "int", value = "Кол-во записей на одной странице.", paramType = "query")
    })
    public CustomPagination getAllByPagination(@ApiParam(hidden = true) @RequestParam Map<String, String> allRequestParams) {
        System.out.println(allRequestParams);
        return subjectService.getAllByPagination(allRequestParams);
    }
}
