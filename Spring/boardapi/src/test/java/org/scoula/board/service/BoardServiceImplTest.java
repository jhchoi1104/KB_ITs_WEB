package org.scoula.board.service;

import lombok.extern.log4j.Log4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.board.dto.BoardDTO;
import org.scoula.board.mapper.BoardMapper;
import org.scoula.config.RootConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
class BoardServiceImplTest {

    @Autowired
    private BoardService service;

    @Test
    void getList() {
        for(BoardDTO board : service.getList()) {
            log.info(board);
        }
    }

    @Test
    void get() {
        log.info(service.get(1L));
    }

    @Test
    void create() {
        BoardDTO board = new BoardDTO();
        board.setTitle("새로 작성하는 글");
        board.setContent("새로 작성하는 내용");
        board.setWriter("user1");

        service.create(board);
    }

    @Test
    void update() {
        BoardDTO board = service.get(1L);

        board.setTitle("제목 수정합니다.");
        log.info("결과는 "+ service.update(board));
    }

    @Test
    void delete() {
        log.info("결과는 "+service.delete(3L));
    }
}