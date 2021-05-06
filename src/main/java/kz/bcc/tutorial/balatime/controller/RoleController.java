package kz.bcc.tutorial.balatime.controller;

import io.swagger.annotations.ApiOperation;
import kz.bcc.tutorial.balatime.model.Role;
import kz.bcc.tutorial.balatime.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/role", produces = APPLICATION_JSON_VALUE)
public class RoleController {
    @Autowired
    private RoleService roleService;

    @ApiOperation(value = "Get All role")
    @GetMapping("/all")
    public ResponseEntity<List<Role>> getAll() {
        return ResponseEntity.ok(roleService.getAll());
    }

    @ApiOperation(value = "Create or update role object")
    @PostMapping()
    public ResponseEntity<Role> calculateTestObject(@RequestBody Role role) {
        return ResponseEntity.ok(roleService.create(role));
    }
    @ApiOperation(value = "Get All role")
    @GetMapping("/id/{id}")
    public ResponseEntity<Role> getTeacherById(@PathVariable Integer id) {
        return ResponseEntity.ok(roleService.getById(id));
    }
}