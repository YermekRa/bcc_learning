package kz.bcc.tutorial.balatime.service;

import kz.bcc.tutorial.balatime.model.User;

import java.util.List;

public interface UserService {
    User create(User user);

    User getById(Integer id);

    List<User> getAll();

    void delete(Integer id);
}
