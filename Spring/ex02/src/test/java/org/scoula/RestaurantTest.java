package org.scoula;

import lombok.extern.log4j.Log4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.config.RootConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.lang.ref.Reference;

import static org.junit.jupiter.api.Assertions.*;

// spring 테스트이다.
@ExtendWith(SpringExtension.class)
//
@ContextConfiguration(classes = {RootConfig.class})
// 로그 출력을 위해 하기
@Log4j
class RestaurantTest {
    @Autowired
    private Restaurant restaurant;

    @Test
    void getChef() {
        // null이면 실패 판정됨.
        assertNotNull(restaurant);
        log.info(restaurant);
        log.info("-------------------------");
        log.info(restaurant.getChef());
    }
}