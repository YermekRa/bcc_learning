create sequence role_id_seq;

alter sequence role_id_seq owner to postgres;

create sequence student_id_seq;

alter sequence student_id_seq owner to postgres;

create sequence teacher_id_seq;

alter sequence teacher_id_seq owner to postgres;

create sequence user_id_seq;

alter sequence user_id_seq owner to postgres;

create sequence journal_id_seq;

alter sequence journal_id_seq owner to postgres;

create sequence class_id_seq;

alter sequence class_id_seq owner to postgres;

create sequence grade_id_seq;

alter sequence grade_id_seq owner to postgres;

create sequence room_id_seq;

alter sequence room_id_seq owner to postgres;

create sequence subject_id_seq;

alter sequence subject_id_seq owner to postgres;

create sequence timetable_id_seq;

alter sequence timetable_id_seq owner to postgres;

create table if not exists role
(
    id   integer not null
    constraint role_pkey
    primary key,
    code varchar(255),
    name varchar(255)
    );

alter table role
    owner to postgres;

create table if not exists student
(
    id         integer not null
    constraint student_pkey
    primary key,
    bird       date,
    class_id   varchar(255),
    fullname   varchar(255),
    user_id    varchar(255),
    birth_date date,
    first_name varchar(255),
    last_name  varchar(255)
    );

alter table student
    owner to postgres;

create table if not exists teacher
(
    id           integer not null
    constraint teacher_pkey
    primary key,
    address      varchar(255),
    birthdate    date,
    first_name   varchar(255),
    phone_number varchar(255),
    birth_date   date,
    last_name    varchar(255),
    level        varchar(255),
    user_id      integer
    );

alter table teacher
    owner to postgres;

create table if not exists "user"
(
    id       integer not null
    constraint user_pkey
    primary key,
    code     varchar(255),
    login    varchar(255),
    password varchar(255),
    arcfl    integer,
    role_id  varchar(255)
    );

alter table "user"
    owner to postgres;

create table if not exists class_subj
(
    class_id integer not null
    constraint class_subj_pkey
    primary key,
    subj_id  varchar(255)
    );

alter table class_subj
    owner to postgres;

create table if not exists classs
(
    id         integer not null
    constraint classs_pkey
    primary key,
    code       varchar(255),
    room_id    integer,
    teacher_id integer
    );

alter table classs
    owner to postgres;

create table if not exists grade
(
    id       integer not null
    constraint grade_pkey
    primary key,
    code     varchar(255),
    longname varchar(255)
    );

alter table grade
    owner to postgres;

create table if not exists room
(
    id    integer not null
    constraint room_pkey
    primary key,
    code  varchar(255),
    floor integer,
    name  varchar(255)
    );

alter table room
    owner to postgres;

create table if not exists subject
(
    id        integer not null
    constraint subject_pkey
    primary key,
    code      varchar(255),
    long_name varchar(255)
    );

alter table subject
    owner to postgres;

create table if not exists teacher_subj
(
    teacher_id integer not null
    constraint teacher_subj_pkey
    primary key,
    subj_id    varchar(255)
    );

alter table teacher_subj
    owner to postgres;

create table if not exists timetable
(
    id       integer not null
    constraint timetable_pkey
    primary key,
    class_id integer,
    date     date,
    room_id  integer,
    sbj_id   integer,
    teach_id integer
);

alter table timetable
    owner to postgres;

create table if not exists journal
(
    id            integer not null
    constraint journal_pkey
    primary key,
    grade         varchar(255),
    stud_id       varchar(255),
    grade_type_id varchar(255),
    time_table_id integer
    constraint journal_timetable_id_fk
    references timetable
    );

alter table journal
    owner to postgres;

