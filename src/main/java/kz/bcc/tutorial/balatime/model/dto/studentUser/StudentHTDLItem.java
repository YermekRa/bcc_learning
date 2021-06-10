package kz.bcc.tutorial.balatime.model.dto.studentUser;

import lombok.Data;

@Data
public class StudentHTDLItem {
    private String title;
    private String summary;
    private StudentHTDLItemContent content;
}
