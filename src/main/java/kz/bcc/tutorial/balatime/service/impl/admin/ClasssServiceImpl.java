package kz.bcc.tutorial.balatime.service.impl.admin;

import kz.bcc.tutorial.balatime.model.Classs;
import kz.bcc.tutorial.balatime.repository.ClasssRepository;
import kz.bcc.tutorial.balatime.repository.pagination.GroupRepositoryPaging;
import kz.bcc.tutorial.balatime.service.admin.ClasssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClasssServiceImpl implements ClasssService {
    @Autowired
    public ClasssRepository classsRepository;
    @Autowired
    private GroupRepositoryPaging groupRepositoryPaging;

    @Override
    public Classs create(Classs classs) {
        return classsRepository.save(classs);
    }

    @Override
    public Classs getById(Integer id) {
        Optional<Classs> optionalClasss = classsRepository.findById(id);
        if (optionalClasss.isPresent()) {
            return classsRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<Classs> getAll() {
        return classsRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        classsRepository.deleteById(id);
    }

    @Override
    public Page<Classs> getAllByPageAndSize(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        return groupRepositoryPaging.findAll(pageable);
    }
}
