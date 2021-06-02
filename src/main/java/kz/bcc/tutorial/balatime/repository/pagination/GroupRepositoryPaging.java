package kz.bcc.tutorial.balatime.repository.pagination;

import kz.bcc.tutorial.balatime.model.Classs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GroupRepositoryPaging extends PagingAndSortingRepository<Classs, Integer> {
    Page<Classs> findAll(Pageable pageable);
}
