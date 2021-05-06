package kz.bcc.tutorial.balatime.repository;

import kz.bcc.tutorial.balatime.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
