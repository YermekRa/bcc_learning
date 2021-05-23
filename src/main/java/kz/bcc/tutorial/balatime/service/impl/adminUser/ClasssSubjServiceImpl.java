package kz.bcc.tutorial.balatime.service.impl.adminUser;

import kz.bcc.tutorial.balatime.model.ClasssSubj;
import kz.bcc.tutorial.balatime.repository.ClasssSubjRepository;
import kz.bcc.tutorial.balatime.service.adminUser.ClasssSubjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClasssSubjServiceImpl implements ClasssSubjService {
    @Autowired
    public ClasssSubjRepository classsSubjRepository;


    @Override
    public ClasssSubj create(ClasssSubj classsSubj) {
        return classsSubjRepository.save(classsSubj);
    }

    @Override
    public ClasssSubj getById(Integer id) {
        Optional<ClasssSubj> optionalClasssSubj = classsSubjRepository.findById(id);
        if (optionalClasssSubj.isPresent()) {
            return classsSubjRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<ClasssSubj> getAll() {
        return classsSubjRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        classsSubjRepository.deleteById(id);
    }
}
