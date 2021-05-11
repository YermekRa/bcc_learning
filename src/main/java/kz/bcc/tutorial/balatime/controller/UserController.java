package kz.bcc.tutorial.balatime.controller;

import io.swagger.annotations.ApiOperation;
import kz.bcc.tutorial.balatime.model.User;
import kz.bcc.tutorial.balatime.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/user", produces = APPLICATION_JSON_VALUE)
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "Get All records")
    @GetMapping("/all")
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.ok(userService.getAll());
    }

    @ApiOperation(value = "Create or update user object")
    @PostMapping()
    public ResponseEntity<User> calculateTestObject(@RequestBody User user) {
        return ResponseEntity.ok(userService.create(user));
    }
    @ApiOperation(value = "Get user by id")
    @GetMapping("/id/{id}")
    public ResponseEntity<User> getTeacherById(@PathVariable Integer id) {
        return ResponseEntity.ok(userService.getById(id));
    }

}
