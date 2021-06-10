package kz.bcc.tutorial.balatime.service.impl.adminUser;

import kz.bcc.tutorial.balatime.model.Teacher;
import kz.bcc.tutorial.balatime.repository.TeacherRepository;
import kz.bcc.tutorial.balatime.service.admin.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherRepository teacherRepository;

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
}
