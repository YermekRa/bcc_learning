package kz.bcc.tutorial.balatime.service.admin;

import kz.bcc.tutorial.balatime.model.Teacher;
import org.springframework.data.domain.Page;

import java.util.List;

public interface TeacherService {
    Teacher create(Teacher teacher);

    Teacher getById(Integer id);

    List<Teacher> getAll();

    void delete(Integer id);

    Page<Teacher> getAllByPageAndSize(Integer page, Integer size);  //pagination
}
