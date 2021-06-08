create sequence class_id_seq;

create sequence grade_id_seq;

create sequence journal_id_seq;

create sequence role_id_seq;

create sequence room_id_seq;

create sequence student_id_seq;

create sequence subject_id_seq;

create sequence teacher_id_seq;

create sequence timetable_id_seq;

create sequence user_id_seq;

create table if not exists b_role
(
    id   integer not null
    constraint b_role_pkey
    primary key,
    code varchar(255)
    constraint uk_5kc62k8h7ggpx8a4v6atbxihw
    unique,
    name varchar(255)
    );

create table if not exists b_user
(
    id       integer not null
    constraint b_user_pkey
    primary key,
    arcfl    integer,
    login    varchar(255)
    constraint uk_5wob1hbbethra74nlo54sqpxu
    unique,
    password varchar(255),
    role_id  integer
    constraint fkm2emiavjweqljspubwda6pktu
    references b_role
    );

create table if not exists class_subj
(
    class_id   integer not null
    constraint class_subj_pkey
    primary key,
    subject_id integer
);

create table if not exists classs
(
    id         integer not null
    constraint classs_pkey
    primary key,
    code       varchar(255),
    room_id    integer,
    teacher_id integer
    );

create table if not exists grade
(
    id       integer not null
    constraint grade_pkey
    primary key,
    code     varchar(255),
    longname varchar(255)
    );

create table if not exists room
(
    id    integer not null
    constraint room_pkey
    primary key,
    code  varchar(255),
    floor integer,
    name  varchar(255)
    );

create table if not exists subject
(
    id        integer not null
    constraint subject_pkey
    primary key,
    code      varchar(255),
    long_name varchar(255)
    );

create table if not exists teacher_subj
(
    teacher_id integer not null
    constraint teacher_subj_pkey
    primary key,
    subject_id integer
);

create table if not exists student
(
    id         integer not null
    constraint student_pkey
    primary key,
    birth_date date,
    class_id   integer,
    first_name varchar(255),
    last_name  varchar(255),
    b_user_id  integer
    );

create table if not exists teacher
(
    id           integer not null
    constraint teacher_pkey
    primary key,
    birth_date   date,
    first_name   varchar(255),
    last_name    varchar(255),
    level        varchar(255),
    phone_number varchar(255),
    b_user_id    integer
    constraint fk5xk6sts5nnq7x3qqtjo7ihkik
    references b_user
    );

create table if not exists timetable
(
    id            integer not null
    constraint timetable_pkey
    primary key,
    class_id      integer
    constraint timetable_classs_id_fk
    references classs,
    date          date,
    room_id       integer
    constraint timetable_room_id_fk
    references room,
    subject_id    integer
    constraint timetable_subject_id_fk
    references subject,
    teacher_id    integer
    constraint timetable_teacher_id_fk
    references teacher,
    edu_year      varchar(64),
    subject_order integer,
    day_of_week   integer
    );

create table if not exists journal
(
    id           integer not null
    constraint journal_pkey
    primary key,
    grade        varchar(255),
    grade_id     integer,
    student_id   integer,
    teacher_id   integer,
    timetable_id integer
    );

