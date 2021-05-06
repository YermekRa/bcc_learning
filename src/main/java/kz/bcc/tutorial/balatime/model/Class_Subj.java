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
public class Class_Subj {
    @Id
    @Column(name = "class_id")
    private Integer classId;
    @Column(name = "subj_id")
    private String subjId;
}
