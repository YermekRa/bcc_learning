package kz.bcc.tutorial.balatime.model.dto.teacher;

import lombok.Data;

@Data
public class LessonItem {
    private String name;
    private String teacher;
    private String classRoom;
    private String group;
    private boolean free;
}
