package kz.bcc.tutorial.balatime.repository.pagination;

import kz.bcc.tutorial.balatime.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentRepositoryPaging extends PagingAndSortingRepository<Student, Integer> {
    Page<Student> findAll(Pageable pageable);
}
