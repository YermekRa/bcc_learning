package kz.bcc.tutorial.balatime.service.adminUser;

import kz.bcc.tutorial.balatime.model.User;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;


public interface UserService {
    User create(User user);

    User getById(Integer id);

    List<User> getAll();


    void delete(Integer id);


    Page<User> getAllByPageAndSize(Integer page, Integer size);  //pagination
}
