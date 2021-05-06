package kz.bcc.tutorial.balatime.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "timetable", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter

public class Timetable {
    @Id
    @SequenceGenerator(name = "timetable_id_seq",
            sequenceName = "timetable_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "timetable_id_seq")
    @Column(name = "id")
    private Integer id;
    @Column(name = "sbj_id")
    private Integer sbjId;
    @Column(name = "date")
    private Date date;
    @Column(name = "room_id")
    private Integer roomId;
    @Column(name = "teach_id")
    private Integer teachId;
    @Column(name = "class_id")
    private Integer classId;

}
