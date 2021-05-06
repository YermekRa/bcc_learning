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
    @Column(name = "sbj_id")
    private String sbjID;
    @Column(name = "date")
    private Date date;
    @Column(name = "stud_id")
    private String studId;
    @Column(name = "grade")
    private String grade;
    @Column(name = "teach_id")
    private Integer teachId;
}
