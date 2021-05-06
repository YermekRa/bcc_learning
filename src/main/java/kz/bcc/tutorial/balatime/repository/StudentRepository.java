package kz.bcc.tutorial.balatime.repository;

import kz.bcc.tutorial.balatime.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
