package kz.bcc.tutorial.balatime.repository;

import kz.bcc.tutorial.balatime.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
