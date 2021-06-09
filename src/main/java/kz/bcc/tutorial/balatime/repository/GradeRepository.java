package kz.bcc.tutorial.balatime.repository;

import kz.bcc.tutorial.balatime.model. Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends JpaRepository< Grade, Integer> {
    Grade findByCode(String code);
    boolean existsByCode(String code);
}
