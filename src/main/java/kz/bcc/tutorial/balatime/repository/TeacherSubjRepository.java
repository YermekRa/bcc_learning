package kz.bcc.tutorial.balatime.repository;

import kz.bcc.tutorial.balatime.model.TeacherSubj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherSubjRepository extends JpaRepository<TeacherSubj, Integer> {
}
