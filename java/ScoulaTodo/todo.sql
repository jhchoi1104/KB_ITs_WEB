create table todo (
    ID integer auto_increment not null primary key,
    TITLE varchar(128) not null,
    DESCRIPTION varchar(512) null,
    DONE boolean,
    USERID varchar(12) not null,
    foreign key (USERID) references users(ID)
                  ON UPDATE CASCADE
                  ON DELETE CASCADE
)

insert into todo(title, description, done, userid)
values ('야구장','프로야구 경기를 봐야합니다.',false,'guest'),
       ('놀기','노는 것도 중요합니다.',false,'guest'),
       ('Vue 학습','Vue 학습을 해야 합니다.',false,'member'),
       ('ES6 공부','ES6공부를 해야합니다.', true, 'guest');