package kz.bcc.tutorial.balatime.service.adminUser;

import kz.bcc.tutorial.balatime.model.Role;
import kz.bcc.tutorial.balatime.model.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface RoleService {
    Role create(Role role);

    Role getById(Integer id);

    List<Role> getAll();

    void delete(Integer id);

}
