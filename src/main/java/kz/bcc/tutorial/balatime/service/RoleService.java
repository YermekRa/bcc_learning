package kz.bcc.tutorial.balatime.service;

import kz.bcc.tutorial.balatime.model.Role;

import java.util.List;

public interface RoleService {
    Role create(Role role);

    Role getById(Integer id);

    List<Role> getAll();

    void delete(Integer id);
}
