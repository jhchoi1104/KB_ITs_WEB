drop table if exists tbl_member;

create table tbl_member
(
    username varchar(50) primary key, -- 사용자 id
    password varchar(128) not null, -- 암호화된 비밀번호
    email varchar(50) not null,
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
insert into tbl_member(username, password, email)
values
    ('admin', '$2a$10$gFd4oPAh43Iz8WkYHRS0AOWD0so27IrrvXzZzbA3QrphiIYnKRHTO', 'admin@galapgos.org'),
    ('user0', '$2a$10$gFd4oPAh43Iz8WkYHRS0AOWD0so27IrrvXzZzbA3QrphiIYnKRHTO', 'user0@galapgos.org'),
    ('user1', '$2a$10$gFd4oPAh43Iz8WkYHRS0AOWD0so27IrrvXzZzbA3QrphiIYnKRHTO', 'user1@galapgos.org'),
    ('user2', '$2a$10$gFd4oPAh43Iz8WkYHRS0AOWD0so27IrrvXzZzbA3QrphiIYnKRHTO', 'user2@galapgos.org'),
    ('user3', '$2a$10$gFd4oPAh43Iz8WkYHRS0AOWD0so27IrrvXzZzbA3QrphiIYnKRHTO', 'user3@galapgos.org'),
    ('user4', '$2a$10$gFd4oPAh43Iz8WkYHRS0AOWD0so27IrrvXzZzbA3QrphiIYnKRHTO', 'user4@galapgos.org');
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


DROP TABLE IF EXISTS tbl_board;
CREATE TABLE tbl_board
(
    no INTEGER AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(200) NOT NULL,
    content TEXT,
    writer VARCHAR(50) NOT NULL,
    reg_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_date DATETIME DEFAULT CURRENT_TIMESTAMP
);
INSERT INTO tbl_board(title, content, writer)
VALUES
    ('테스트 제목1', '테스트 내용1', 'admin'),
    ('테스트 제목2', '테스트 내용2', 'admin'),
    ('테스트 제목3', '테스트 내용3', 'admin'),
    ('테스트 제목4', '테스트 내용4', 'admin'),
    ('테스트 제목5', '테스트 내용5', 'admin');
SELECT * FROM tbl_board;

DROP TABLE IF EXISTS tbl_board_attachment;
CREATE TABLE tbl_board_attachment (
                                      no INTEGER AUTO_INCREMENT PRIMARY KEY,
                                      filename VARCHAR(256) NOT NULL, -- 원본 파일 명
                                      path VARCHAR(256) NOT NULL, -- 서버에서의 파일 경로
                                      content_type VARCHAR(56), -- content-type
                                      size INTEGER, -- 파일의 크기
                                      bno INTEGER NOT NULL, -- 게시글 번호, FK
                                      reg_date DATETIME DEFAULT now(),
                                      CONSTRAINT FOREIGN KEY(bno) REFERENCES tbl_board(no)
);

SELECT * FROM tbl_board_attachment;

select b.*, a.no as ano, a.bno, a.filename, a.path,
       a.content_type, a.size, a.reg_date as a_reg_date
from tbl_board b
         left outer join tbl_board_attachment a
                         on b.no = a.bno
where b.no = 10
order by filename
