package kz.bcc.tutorial.balatime.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Table(name = "User", schema = "public")

public class User {
    @Id
    @SequenceGenerator(name = "user_id_seq",
            sequenceName = "user_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "user_id_seq")
    @Column(name = "id")
    private Integer id;
    @Column(name = "code")
    private String code;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
}
