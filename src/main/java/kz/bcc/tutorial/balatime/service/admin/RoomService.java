package kz.bcc.tutorial.balatime.service.admin;

import kz.bcc.tutorial.balatime.model.Room;

import java.util.List;

public interface RoomService {
    Room create(Room journal);

    Room getById(Integer id);

    List<Room> getAll();

    void delete(Integer id);
}
