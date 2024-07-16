package org.scoula.kb.dao;

import org.scoula.kb.common.JDBCUtil;
import org.scoula.kb.domain.UserV0;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {
    Connection conn = JDBCUtil.getConnection();

    // users 테이블 관련 sql 명령어
    private String user_list = "select * from users";
    private String user_get = "select * from users where id=?";
    private String user_insert = "insert into users valus(?,?,?,?)";
    private String user_update = "update users set name =?, role=? where id=?";
    private String user_delete = "delete from users where id =?";

    @Override
    public int create(UserV0 user) throws SQLException {
        try (PreparedStatement pstmt = conn.prepareStatement(user_insert)) {
            pstmt.setString(1, user.getId());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getName());
            pstmt.setString(4, user.getRole());
            return pstmt.executeUpdate();
        }
    }
    private UserV0 map(ResultSet rs) throws SQLException {
        UserV0 user = new UserV0();
        user.setId(rs.getString("id"));
        user.setPassword(rs.getString("password"));
        user.setName(rs.getString("name"));
        user.setRole(rs.getString("role"));
        return user;
    }

    @Override
    public List<UserV0> getList() throws SQLException {
        List<UserV0> userList = new ArrayList<UserV0>();
        Connection conn = JDBCUtil.getConnection();
        try(PreparedStatement pstmt = conn.prepareStatement(user_list);
        ResultSet rs = pstmt.executeQuery()) {
            while(rs.next()) {
                UserV0 user = map(rs);
                userList.add(user);
            }
        }
        return userList;
    }

    @Override
    public Optional<UserV0> get(String id) throws SQLException {
        try (PreparedStatement stmt = conn.prepareStatement(user_get)) {
            stmt.setString(1,id);
            try(ResultSet rs = stmt.executeQuery()) {
                if(rs.next()) {
                    return Optional.of(map(rs));
                }
            }
        }
        return Optional.empty();
    }

    @Override
    public int update(UserV0 user) throws SQLException {
        Connection conn = JDBCUtil.getConnection();
        try(PreparedStatement stmt = conn.prepareStatement(user_update)) {
            stmt.setString(1, user.getName());
            stmt.setString(2,user.getRole());
            stmt.setString(3,user.getId());
            return stmt.executeUpdate();
        }
    }

    @Override
    public int delete(String id) throws SQLException {
        try(PreparedStatement stmt = conn.prepareStatement(user_delete)) {
            stmt.setString(1,id);
            return stmt.executeUpdate();
        }
    }
}
