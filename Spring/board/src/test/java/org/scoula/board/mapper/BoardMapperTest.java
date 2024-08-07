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
    @DisplayName("BoardMapper의 목록 불러오기")
    void getList() {
        for(BoardVO board: mapper.getList()) {
            log.info(board);
        }
    }

    @Test
    @DisplayName("Board 목록 하나 가져오기")
    void get() {
        BoardVO board = mapper.get(1L);
        log.info(board);
    }

    @Test
    @DisplayName("Board 추가하기")
    void create() {
        BoardVO board = new BoardVO();
        board.setName("승민");
        board.setTitle("승민의 작성");
        board.setWriter("정승민");
        board.setSex("남");
        mapper.create(board);
        log.info(board);
    }
}