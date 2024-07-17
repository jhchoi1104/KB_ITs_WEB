package org.scoula.todo.dao;

import org.scoula.todo.TodoApp;
import org.scoula.todo.common.JDBCUtil;
import org.scoula.todo.domain.TodoV0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class TodoDaoImpl implements TodoDao {
    Connection conn = JDBCUtil.getConnection();

    @Override
    public int getTotalCount(String userId) throws SQLException {
        String sql = "select count(*) from todo where userid=?";
        try(PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, userId);
            try (ResultSet rs = stmt.executeQuery()) {
                rs.next();
                return rs.getInt(1);
            }
        }
    }

    @Override
    public int create(TodoV0 todo) throws SQLException {
        return 0;
    }

    @Override
    public List<TodoV0> getList(String userId) throws SQLException {
        return List.of();
    }

    @Override
    public Optional<TodoV0> get(String userId, Long id) throws SQLException {
        return Optional.empty();
    }

    @Override
    public List<TodoV0> search(String userId, String keyword) throws SQLException {
        return List.of();
    }

    @Override
    public int update(String userId, TodoV0 todo) throws SQLException {
        return 0;
    }

    @Override
    public int delete(String userId, Long id) throws SQLException {
        return 0;
    }
}
