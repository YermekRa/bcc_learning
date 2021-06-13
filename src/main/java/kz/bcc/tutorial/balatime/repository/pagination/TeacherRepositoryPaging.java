package kz.bcc.tutorial.balatime.repository.pagination;

import kz.bcc.tutorial.balatime.model.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TeacherRepositoryPaging extends PagingAndSortingRepository<Teacher, Integer> {
    Page<Teacher> findAll(Pageable pageable);
}
