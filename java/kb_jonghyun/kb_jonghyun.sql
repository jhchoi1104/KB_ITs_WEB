use kb;

create table users (
    id varchar(12) not null primary key,
    password varchar(12) not null,
    name varchar(30) not null,
    role varchar(6) not null
);

insert into users values('guest', '1234','방문자','user');
insert into users values('admin', '2345','관리자','admin');
insert into users values('member', '3456','일반회원','user');

select * from users;