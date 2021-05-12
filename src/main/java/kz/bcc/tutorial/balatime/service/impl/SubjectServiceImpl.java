package kz.bcc.tutorial.balatime.service.impl;

import kz.bcc.tutorial.balatime.model.Subject;
import kz.bcc.tutorial.balatime.repository.SubjectRepository;
import kz.bcc.tutorial.balatime.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    public SubjectRepository subjectRepository;


    @Override
    public Subject create(Subject journal) {
        return subjectRepository.save(journal);
    }

    @Override
    public Subject getById(Integer id) {
        Optional<Subject> optionalJournal = subjectRepository.findById(id);
        if (optionalJournal.isPresent()) {
            return subjectRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<Subject> getAll() {
        return subjectRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        subjectRepository.deleteById(id);
    }
}
