package kz.bcc.tutorial.balatime.service.impl.adminUser;

import kz.bcc.tutorial.balatime.model.Student;
import kz.bcc.tutorial.balatime.repository.StudentRepository;
import kz.bcc.tutorial.balatime.repository.pagination.StudentRepositoryPaging;
import kz.bcc.tutorial.balatime.service.adminUser.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    private StudentRepositoryPaging studentRepositoryPaging;

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getById(Integer id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            return studentRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Page<Student> getAllByPageAndSize(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        return studentRepositoryPaging.findAll(pageable);
    }


}
