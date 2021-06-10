package kz.bcc.tutorial.balatime.service.impl.admin;

import kz.bcc.tutorial.balatime.model.Grade;
import kz.bcc.tutorial.balatime.repository.GradeRepository;
import kz.bcc.tutorial.balatime.service.admin.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    private GradeRepository gradeRepository;

    @Override
    public Grade getById(int id) {
        return gradeRepository.findById(id).get();
    }

    @Override
    public Grade create(Grade grade) {
        String userAction = "insert";
        if (gradeRepository.existsByCode(grade.getCode())) {
            userAction = "update";
        }
        return gradeRepository.save(grade);
    }

    @Override
    public List<Grade> getAll() {
        return gradeRepository.findAll();
    }

    @Override
    public Grade getByCode(String code) {
        return gradeRepository.findByCode(code);
    }

    @Override
    public void deleteById(Integer id) {
        gradeRepository.deleteById(id);
    }


}
