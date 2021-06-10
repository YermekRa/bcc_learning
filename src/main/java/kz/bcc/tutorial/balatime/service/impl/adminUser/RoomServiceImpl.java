package kz.bcc.tutorial.balatime.service.impl.adminUser;

import kz.bcc.tutorial.balatime.model.Room;
import kz.bcc.tutorial.balatime.repository.RoomRepository;
import kz.bcc.tutorial.balatime.service.admin.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    RoomRepository roomRepository;

    @Override
    public Room getById(int id) {
        return roomRepository.findById(id).get();
    }

    @Override
    public Room create(Room room) {
        if (roomRepository.existsByCode(room.getCode())) {
            return null;
        }
        return roomRepository.save(room);
    }

    @Override
    public List<Room> getAll() {
        return roomRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        roomRepository.deleteById(id);
    }
}
