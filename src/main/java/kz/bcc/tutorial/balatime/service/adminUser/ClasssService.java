package kz.bcc.tutorial.balatime.service.adminUser;

import kz.bcc.tutorial.balatime.model.Classs;

import java.util.List;

public interface ClasssService {
    Classs create(Classs classs);

    Classs getById(Integer id);

    List<Classs> getAll();

    void delete(Integer id);
}
