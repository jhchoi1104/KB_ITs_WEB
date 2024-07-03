package org.scoula.todo.dao;

import org.scoula.todo.domain.Todo;

import java.util.ArrayList;
import java.util.List;

public class TodoListDao {
    private static TodoListDao instance = new TodoListDao();

    public static TodoListDao getInstance() {
        return instance;
    }

    private List<Todo> list;

    private TodoListDao() {
        list = new ArrayList<>();
        for (int i =0;i<10;i++) {
            Todo todo = Todo.builder()
                    .title("Todo " +i)
                    .description("Description " +i)
                    .done(false)
                    .build();
            list.add(todo);
        }
    }

    public List<Todo> getList() {
        return list;
    }

    public Todo getTodo(int id) {
        for (Todo todo : list) {
            if (todo.getId()==id) {
                return todo;
            }
        }
        return null;
    }

    public void add(Todo todo) {
        list.add(todo);
    }

    public void update(Todo todo) {
        for (int i =0;i<list.size();i++) {
            if(todo.getId()==list.get(i).getId()) {
                list.set(i, todo);
            }
        }
    }

    public void delete(int id) {
        for (int i =0;i<list.size();i++) {
            if(list.get(i).getId()==id) {
                list.remove(i);
                return;
            }
        }
    }
}
