package kz.bcc.tutorial.balatime.service.impl.admin;

import kz.bcc.tutorial.balatime.model.Teacher;
import kz.bcc.tutorial.balatime.model.User;
import kz.bcc.tutorial.balatime.repository.TeacherRepository;
import kz.bcc.tutorial.balatime.repository.pagination.TeacherRepositoryPaging;
import kz.bcc.tutorial.balatime.repository.pagination.UserRepositoryPaging;
import kz.bcc.tutorial.balatime.service.admin.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherRepository teacherRepository;
    @Autowired
    private TeacherRepositoryPaging teacherRepositoryPaging;
    @Override
    public Teacher create(Teacher teacher) {
        return teacherRepository.saveAndFlush(teacher);

    }

    @Override
    public Teacher getById(Integer id) {
        Optional<Teacher> optionalTeacher = teacherRepository.findById(id);
        if (optionalTeacher.isPresent()) {
            return teacherRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        teacherRepository.deleteById(id);
    }

    @Override
    public Page<Teacher> getAllByPageAndSize(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        return teacherRepositoryPaging.findAll(pageable);
    }
}
