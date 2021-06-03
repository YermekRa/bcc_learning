package kz.bcc.tutorial.balatime.controller.adminUser;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import kz.bcc.tutorial.balatime.model.User;
import kz.bcc.tutorial.balatime.service.adminUser.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
    public ResponseEntity<User> getUserById(@PathVariable Integer id) {
        return ResponseEntity.ok(userService.getById(id));
    }

    @ApiOperation(value = "Get user by id")
    @GetMapping("/page/{page}/size/{size}")
    public ResponseEntity<Page<User>> getByPageAndSize(
            @PathVariable Integer page,
            @PathVariable Integer size
    ) {
        return ResponseEntity.ok(userService.getAllByPageAndSize(page, size));
    }


    @ApiOperation(value = "Delete User by Id")
    @DeleteMapping("/id/{id}")
    public void deleteUserById(@PathVariable Integer id) {
        userService.delete(id);
    }

}


