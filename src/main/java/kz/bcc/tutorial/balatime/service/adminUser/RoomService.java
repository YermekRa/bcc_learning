package kz.bcc.tutorial.balatime.service.adminUser;

import kz.bcc.tutorial.balatime.model.Room;

import java.util.List;

public interface RoomService {
    Room getById(int id);
    Room create(Room role);
    List<Room> getAll();
    void deleteById(Integer id);
}
