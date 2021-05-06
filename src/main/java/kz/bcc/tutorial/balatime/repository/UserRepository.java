package kz.bcc.tutorial.balatime.repository;

import kz.bcc.tutorial.balatime.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
