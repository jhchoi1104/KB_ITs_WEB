package org.scoula.board.mapper;

import lombok.extern.log4j.Log4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.board.domain.BoardVO;
import org.scoula.config.RootConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { RootConfig.class })
@Log4j
class BoardMapperTest {

    @Autowired
    private BoardMapper mapper;

    @Test
    @DisplayName("BoardMapper의 목록 보기")
    void getList() {
        for(BoardVO board : mapper.getList()) {
            log.info(board);
        }
    }

    @Test
    @DisplayName("Board 목록 하나 보기")
    void get() {
        log.info(mapper.get(1L));
    }

    @Test
    @DisplayName("목록 하나 추가하기")
    void create() {
        BoardVO board = new BoardVO();
        board.setTitle("새로 작성하는 글");
        board.setContent("새로 작성된 내용");
        board.setWriter("종현최");
        mapper.create(board);
        log.info(board);
    }

    @Test
    @DisplayName("목록 하나 수정하기")
    void update() {
        BoardVO board = new BoardVO();
        board.setNo(5L);
        board.setTitle("수정된 제목");
        board.setContent("수정된 내용");
        board.setWriter("수정된 종현최");

        mapper.update(board);
        log.info(board);
    }

    @Test
    @DisplayName("목록 하나 삭제하기")
    void delete() {
        log.info(mapper.delete(4L));
    }
}