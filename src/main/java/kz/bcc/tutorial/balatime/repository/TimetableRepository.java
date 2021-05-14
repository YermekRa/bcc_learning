package kz.bcc.tutorial.balatime.repository;

import kz.bcc.tutorial.balatime.model.Timetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimetableRepository extends JpaRepository<Timetable, Integer> {
}
