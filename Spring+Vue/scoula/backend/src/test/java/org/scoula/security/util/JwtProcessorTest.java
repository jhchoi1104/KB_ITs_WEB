package org.scoula.security.util;

import lombok.extern.log4j.Log4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.config.RootConfig;
import org.scoula.security.config.SecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { RootConfig.class, SecurityConfig.class })
@Log4j
class JwtProcessorTest {

    @Autowired
    JwtProcessor jwtProcessor;

    @Test
    void generateToken() {
        String username = "user0";
        String token = jwtProcessor.generateToken(username);
        log.info(token);
        assertNotNull(token);
    }

    @Test
    void getUsername() {
        String token="eyJhbGciOiJIUzM4NCJ9.eyJzdWIiOiJ1c2VyMCIsImlhdCI6MTcyNDIwNjU3NywiZXhwIjoxNzI0MjA2ODc3fQ.XNw9ZxYt2T2IeJv2br6Qs0DqiXdBFLcITi1pkTqPzKcceLLtEeylNMuHuaR8ZUP0";

        String username = jwtProcessor.getUsername(token);
        log.info(username);
        assertNotNull(username);
    }

    @Test
    void validateToken() {
        // 5분 경과 후 테스트
        String token="eyJhbGciOiJIUzM4NCJ9.eyJzdWIiOiJ1c2VyMCIsImlhdCI6MTcyNDIwNjk3NiwiZXhwIjoxNzI0MjA3Mjc2fQ.uGSe5kETxI-qzZF53BJt7UTsD-_NT2QpZYDoWHwnB8c8i5mm5ZcJquIEL52eSr0g";

        boolean isValid = jwtProcessor.validateToken(token);
        log.info(isValid);
        assertTrue(isValid);
    }
}