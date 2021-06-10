package kz.bcc.tutorial.balatime.service.impl.adminUser;

import kz.bcc.tutorial.balatime.model.CustomPagination;
import kz.bcc.tutorial.balatime.model.Subject;
import kz.bcc.tutorial.balatime.repository.SubjectRepository;
import kz.bcc.tutorial.balatime.service.admin.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public Subject getById(int id) {
        return subjectRepository.findById(id).get();
    }

    @Override
    public Subject create(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public List<Subject> getAll() {
        return subjectRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        subjectRepository.deleteById(id);
    }

    @Override
    public CustomPagination getAllByPagination(Map<String, String> allRequestParams) {
        CustomPagination customPagination = new CustomPagination();
        int pageNumber = 0;
        int pageSize = 6;
        String a;

        if (allRequestParams.containsKey("page")) {
            pageNumber = Integer.parseInt(allRequestParams.get("page"));
        }
        if (allRequestParams.containsKey("size")) {
            pageSize = Integer.parseInt(allRequestParams.get("size"));
        }

        final Pageable pageableRequest = PageRequest.of(pageNumber, pageSize);

        customPagination.setList(subjectRepository.findAll(pageableRequest).getContent());
        customPagination.setTotalSize((int) subjectRepository.findAll(pageableRequest).getTotalElements());
        customPagination.setPage(pageNumber);
        customPagination.setSize(pageSize);

        return customPagination;
    }
}
