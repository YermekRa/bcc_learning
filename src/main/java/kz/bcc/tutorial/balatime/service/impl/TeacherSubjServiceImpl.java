package kz.bcc.tutorial.balatime.service.impl;

import kz.bcc.tutorial.balatime.model.TeacherSubj;
import kz.bcc.tutorial.balatime.repository.TeacherSubjRepository;
import kz.bcc.tutorial.balatime.service.TeacherSubjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherSubjServiceImpl implements TeacherSubjService {
    @Autowired
    public TeacherSubjRepository teacherSubjRepository;


    @Override
    public TeacherSubj create(TeacherSubj journal) {
        return teacherSubjRepository.save(journal);
    }

    @Override
    public TeacherSubj getById(Integer id) {
        Optional<TeacherSubj> optionalTeacherSubj = teacherSubjRepository.findById(id);
        if (optionalTeacherSubj.isPresent()) {
            return teacherSubjRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<TeacherSubj> getAll() {
        return teacherSubjRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        teacherSubjRepository.deleteById(id);
    }
}
