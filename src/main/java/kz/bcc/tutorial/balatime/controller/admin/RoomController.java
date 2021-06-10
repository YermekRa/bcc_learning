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
    RoomService roomService;

    @ApiOperation(value = "Get All rooms")
    @GetMapping("/all")
    public List<Room> getAll() {
        return roomService.getAll();
    }

    @ApiOperation(value = "Create or update room object")
    @PostMapping()
    public Room createRoom(@RequestBody Room room) {
        return roomService.create(room);
    }

    @ApiOperation(value = "Get room by id")
    @GetMapping("/id/{id}")
    public Room getRoomById(@PathVariable Integer id) {
        return roomService.getById(id);
    }

    @ApiOperation(value = "Delete grade object")
    @DeleteMapping("/delete/{id}")
    public void deleteRoom(@PathVariable Integer id) {
        roomService.deleteById(id);
    }
}
