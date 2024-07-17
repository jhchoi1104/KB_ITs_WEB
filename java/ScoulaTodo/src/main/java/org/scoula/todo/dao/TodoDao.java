package org.scoula.todo.dao;

import org.scoula.todo.domain.TodoV0;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface TodoDao {
    int getTotalCount(String userId) throws SQLException;

    int create(TodoV0 todo) throws SQLException;

    List<TodoV0> getList(String userId) throws SQLException;

    Optional<TodoV0> get(String userId, Long id) throws SQLException;

    List<TodoV0> search(String userId, String keyword) throws SQLException;

    int update(String userId, TodoV0 todo) throws SQLException;

    int delete(String userId, Long id) throws SQLException;
}
