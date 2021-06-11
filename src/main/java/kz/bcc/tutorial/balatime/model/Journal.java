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
    @Column(name = "student_id")
    private Integer studentId;
    @ManyToOne
    @JoinColumn(name = "student_id", insertable = false, updatable = false)
    private Student student;
    @Column(name = "grade_id")
    private Integer gradeId;
    @Column(name = "teacher_id")
    private Integer teacherId;
    @ManyToOne
    @JoinColumn(name = "teacher_id", insertable = false, updatable = false)
    private Teacher teacher;
    @Column(name = "grade")
    private String grade;
    @Column(name = "timetable_id")
    private Integer timeTableId;
    @ManyToOne
    @JoinColumn(name = "timetable_id", insertable = false, updatable = false)
    private Timetable timetable;
}
