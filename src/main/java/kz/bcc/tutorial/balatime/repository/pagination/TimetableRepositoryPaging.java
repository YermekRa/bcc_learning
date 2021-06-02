package kz.bcc.tutorial.balatime.repository.pagination;

import kz.bcc.tutorial.balatime.model.Timetable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TimetableRepositoryPaging extends PagingAndSortingRepository<Timetable, Integer> {
    Page<Timetable> findAll(Pageable pageable);
}
