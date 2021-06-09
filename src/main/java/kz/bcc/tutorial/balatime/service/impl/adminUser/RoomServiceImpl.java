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
    public RoomRepository roomRepository;


    @Override
    public Room create(Room journal) {
        return roomRepository.save(journal);
    }

    @Override
    public Room getById(Integer id) {
        Optional<Room> optionalRoom = roomRepository.findById(id);
        if (optionalRoom.isPresent()) {
            return roomRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<Room> getAll() {
        return roomRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        roomRepository.deleteById(id);
    }
}
