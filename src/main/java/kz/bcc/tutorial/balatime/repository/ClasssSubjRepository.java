package kz.bcc.tutorial.balatime.repository;

import kz.bcc.tutorial.balatime.model.ClasssSubj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasssSubjRepository extends JpaRepository<ClasssSubj, Integer> {
}
