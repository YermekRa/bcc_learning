package kz.bcc.tutorial.balatime.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;


@Table(name = "student", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class Student {
    @Id
    @SequenceGenerator(name = "student_id_seq",
            sequenceName = "student_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "student_id_seq")
    @Column(name = "id")
    private Integer id;
    @Column(name = "b_user_id")
    private Integer userId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @ManyToOne
    @JoinColumn(name = "class_id", insertable = false, updatable = false)
    private Classs classs;
    @Column(name = "class_id")
    private Integer classId;
    @Column(name = "birth_date")
    private Date birthDate;
}
