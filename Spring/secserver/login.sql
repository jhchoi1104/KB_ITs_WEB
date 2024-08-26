drop table if exists tbl_member_auth;
drop table if exists tbl_member;

create table tbl_member
(
    username varchar(50) primary key, -- 사용자 id
    password varchar(128) not null, -- 암호화된 비밀번호
    email varchar(50) not null,
    birth date,
    reg_date datetime default now(),
    update_date datetime default now()
);

-- 사용자 권한 테이블
drop table if exists tbl_member_auth;
create table tbl_member_auth
(
    username varchar(50) not null, -- 사용자 id
    auth varchar(50) not null, -- 권한 문자열 ROLE_ADMIN, ROLE_MANAGER, ROLE_MEMBER 등
    primary key(username, auth), -- 복합키
    constraint fk_authorities_users foreign key (username) references tbl_member(username)
);

-- 테스트 사용자 추가
insert into tbl_member(username, password, email, birth)
values
    ('admin', '$2a$10$gFd4oPAh43Iz8WkYHRS0AOWD0so27IrrvXzZzbA3QrphiIYnKRHTO', 'admin@galapgos.org', '1998-11-04'),
    ('user0', '$2a$10$gFd4oPAh43Iz8WkYHRS0AOWD0so27IrrvXzZzbA3QrphiIYnKRHTO', 'user0@galapgos.org', '1999-12-04'),
    ('user1', '$2a$10$gFd4oPAh43Iz8WkYHRS0AOWD0so27IrrvXzZzbA3QrphiIYnKRHTO', 'user1@galapgos.org', '2002-01-19'),
    ('user2', '$2a$10$gFd4oPAh43Iz8WkYHRS0AOWD0so27IrrvXzZzbA3QrphiIYnKRHTO', 'user2@galapgos.org', '2000-08-12'),
    ('user3', '$2a$10$gFd4oPAh43Iz8WkYHRS0AOWD0so27IrrvXzZzbA3QrphiIYnKRHTO', 'user3@galapgos.org', '2004-04-20'),
    ('user4', '$2a$10$gFd4oPAh43Iz8WkYHRS0AOWD0so27IrrvXzZzbA3QrphiIYnKRHTO', 'user4@galapgos.org', '1993-04-29');
select * from tbl_member;

insert into tbl_member_auth(username, auth)
values
    ('admin','ROLE_ADMIN'),
    ('admin','ROLE_MANAGER'),
    ('admin','ROLE_MEMBER'),
    ('user0','ROLE_MANAGER'),
    ('user0','ROLE_MEMBER'),
    ('user1','ROLE_MEMBER'),
    ('user2','ROLE_MEMBER'),
    ('user3','ROLE_MEMBER'),
    ('user4','ROLE_MEMBER');
select * from tbl_member_auth order by auth;

select m.username, password, email, reg_date, update_date, auth from tbl_member m
left join tbl_member_auth a on m.username = a.username
where m.username = 'admin';
