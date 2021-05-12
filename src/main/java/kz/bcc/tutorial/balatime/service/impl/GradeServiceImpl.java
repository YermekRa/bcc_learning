package kz.bcc.tutorial.balatime.service.impl;

import kz.bcc.tutorial.balatime.model.Grade;
import kz.bcc.tutorial.balatime.repository.GradeRepository;
import kz.bcc.tutorial.balatime.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    public GradeRepository gradeRepository;


    @Override
    public Grade create(Grade journal) {
        return gradeRepository.save(journal);
    }

    @Override
    public Grade getById(Integer id) {
        Optional<Grade> optionalGrade = gradeRepository.findById(id);
        if (optionalGrade.isPresent()) {
            return gradeRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<Grade> getAll() {
        return gradeRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        gradeRepository.deleteById(id);
    }
}
