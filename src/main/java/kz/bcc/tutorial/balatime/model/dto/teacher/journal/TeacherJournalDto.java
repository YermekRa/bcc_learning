package kz.bcc.tutorial.balatime.model.dto.teacher.journal;

import kz.bcc.tutorial.balatime.model.dto.teacher.LessonItem;
import lombok.Data;

@Data
public class TeacherJournalDto {
    private Integer ord;
    private String student;
    private String grade;
    private String prim;
}
