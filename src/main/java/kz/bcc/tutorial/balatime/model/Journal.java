package kz.bcc.tutorial.balatime.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "journal", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter

public class Journal {
    @Id
    @SequenceGenerator(name = "journal_id_seq",
            sequenceName = "journal_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "journal_id_seq")
    @Column(name = "id")
    private Integer id;
    @Column(name = "stud_id")
    private String studId;
    @Column(name = "grade_type_id")
    private String gradeTypeId;
    @Column(name = "grade")
    private Integer grade;
    @Column(name = "time_table_id")
    private Integer timeTableId;
}
