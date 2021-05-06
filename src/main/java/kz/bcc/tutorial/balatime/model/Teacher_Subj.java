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
public class Teacher_Subj {
    @Id
    @Column(name = "teacher_id")
    private Integer teacherId;
    @Column(name = "subj_id")
    private Integer subjId;
}
