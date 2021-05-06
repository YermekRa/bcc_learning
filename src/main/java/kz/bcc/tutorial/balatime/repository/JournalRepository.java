package kz.bcc.tutorial.balatime.repository;

import kz.bcc.tutorial.balatime.model.Journal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalRepository extends JpaRepository<Journal, Integer> {
}
