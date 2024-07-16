package org.scoula.kb.dao;

import org.junit.jupiter.api.*;
import org.scoula.kb.common.JDBCUtil;
import org.scoula.kb.domain.UserV0;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class UserDaoTest {
    UserDao dao = new UserDaoImpl();

    @AfterAll
    static void tearDown() {
        JDBCUtil.close();
    }

    @Test
    @DisplayName("User을 등록합니다.")
    @Order(1)
    void create()throws SQLException {
        UserV0 user = new UserV0("ssam10","ssamwr22","씸","ADMIN");
        int count =dao.create(user);
        Assertions.assertEquals(1, count);
    }

    @Test
    @DisplayName("UserDao User 목록을 추출합니다.")
    @Order(2)
    void getList() throws SQLException {
        List<UserV0> list = dao.getList();
        for(UserV0 vo:list) {
            System.out.println(vo);
        }
    }

    @Test
    @DisplayName("특정 user 1건을 추출합니다.")
    @Order(3)
    void get() throws SQLException {
        UserV0 user = dao.get("ssam10").orElseThrow(NoSuchElementException::new);
        Assertions.assertNull(user);
    }

    @Test
    @DisplayName("user의 정보를 수정합니다.")
    @Order(4)
    void update() throws SQLException {
        UserV0 user = dao.get("ssam10").orElseThrow(NoSuchElementException::new);
        user.setName("쌤즈");
        int count = dao.update(user);
        Assertions.assertEquals(1, count);
    }

    private UserVO map(ResultSet rs) throws SQLException {
        UserVO user = new UserVO();
        user.setId(rs.getString("ID"));
        user.setPassword(rs.getString("PASSWORD"));
        user.setName(rs.getString("NAME"));
        user.setRole(rs.getString("ROLE"));
        return user;
    }
}