package org.scoula.kb.dao;

import com.google.protobuf.OptionOrBuilder;
import org.scoula.kb.domain.UserV0;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface UserDao {
    // 회원정보 등록
    int create(UserV0 user) throws SQLException;

    // 회원목록 조회
    List<UserV0> getList() throws SQLException;

    // 회원정보 조회
    Optional<UserV0> get(String id) throws SQLException;

    // 회원 수정
    int update(UserV0 user) throws SQLException;

    // 회원 삭제
    int delete(String id) throws SQLException;
}
