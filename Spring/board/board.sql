DROP TABLE IF EXISTS tbl_board
;
CREATE TABLE tbl_board
(
    no INTEGER AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(200) NOT NULL,
    name varchar(50) not null,
    sex varchar(10),
    content TEXT,
    writer VARCHAR(50) NOT NULL,
    reg_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_date DATETIME DEFAULT CURRENT_TIMESTAMP
);
INSERT INTO tbl_board(title, name, sex, content, writer)
VALUES
    ('테스트 제목1', '최종현','남', '테스트 내용1', 'user00'),
    ('테스트 제목2', '이가은','여', '테스트 내용2', 'user00'),
    ('테스트 제목3', '이은지','여', '테스트 내용3', 'user00'),
    ('테스트 제목4', '박정빈','남', '테스트 내용4', 'user00'),
    ('테스트 제목5', '윤섭시치','남', '테스트 내용5', 'user00');
SELECT * FROM tbl_board
;