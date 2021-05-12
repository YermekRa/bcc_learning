package kz.bcc.tutorial.balatime.repository;

import kz.bcc.tutorial.balatime.model.Classs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasssRepository extends JpaRepository<Classs, Integer> {
}
