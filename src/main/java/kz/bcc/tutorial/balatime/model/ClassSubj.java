package kz.bcc.tutorial.balatime.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "class_subj", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class ClassSubj {
    @Id
    @Column(name = "class_id")
    private Integer classId;
    @Column(name = "subject_id")
    private Integer subjectId;
}
