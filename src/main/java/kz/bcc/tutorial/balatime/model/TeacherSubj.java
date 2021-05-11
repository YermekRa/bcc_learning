package kz.bcc.tutorial.balatime.model;

import lombok.*;

import javax.persistence.*;

@Table(name = "teacher_subj", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class TeacherSubj {
    @Id
    @Column(name = "teacher_id")
    private Integer teacherId;
    @Column(name = "subject_id")
    private Integer subjectId;
}
