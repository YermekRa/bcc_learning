package kz.bcc.tutorial.balatime.controller.admin;

import io.swagger.annotations.ApiOperation;
import kz.bcc.tutorial.balatime.model.Room;
import kz.bcc.tutorial.balatime.service.admin.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/room", produces = APPLICATION_JSON_VALUE)
public class RoomController {
    @Autowired
    private RoomService roomService;


    @ApiOperation(value = "Get All records")
    @GetMapping("/all")
    public ResponseEntity<List<Room>> getAll() {
        return ResponseEntity.ok(roomService.getAll());
    }

    @ApiOperation(value = "Create or update journal object")
    @PostMapping()
    public ResponseEntity<Room> calculateTestObject(@RequestBody Room room) {
        return ResponseEntity.ok(roomService.create(room));
    }
    @ApiOperation(value = "Get room by Id")
    @GetMapping("/id/{id}")
    public ResponseEntity<Room> getTeacherById(@PathVariable Integer id) {
        return ResponseEntity.ok(roomService.getById(id));
    }

    @ApiOperation(value = "Delete room by Id")
    @DeleteMapping("/id/{id}")
    public void deleteJournalById(@PathVariable Integer id) {
        roomService.delete(id);
    }
}
