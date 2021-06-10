package kz.bcc.tutorial.balatime.service.admin;

import kz.bcc.tutorial.balatime.model.Student;
import org.springframework.data.domain.Page;

import java.util.List;

public interface StudentService {
    Student create(Student student);

    Student getById(Integer id);

    List<Student> getAll();

    void delete(Integer id);

    Page<Student> getAllByPageAndSize(Integer page, Integer size);  //pagination
}
