package kz.bcc.tutorial.balatime.repository;

import kz.bcc.tutorial.balatime.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
}
