package kz.bcc.tutorial.balatime.repository;

import kz.bcc.tutorial.balatime.model.EduYear;
import kz.bcc.tutorial.balatime.model.Timetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TimetableRepository extends JpaRepository<Timetable, Integer> {
    List<Timetable> findAllByEduYearAndTeacherId(EduYear eduYear, Integer teacherId);

    List<Timetable> getAllByTeacherIdAndSubjectOrder(Integer teacherId, Integer subjectOrder);

    List<Timetable> findAllByTeacherIdAndSubjectOrder(Integer teacherId, Integer subjectOrder);
}
