package org.scoula.ex06.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class TodoController {
    public String getList(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<String> list = Arrays.asList("Todo 1","Todo 2","Todo 3");
        request.setAttribute("todoList",list);
        System.out.println("GET /todo/list");
        return "todo/list";
    }
    public String getView(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("GET /todo/view");
        return "todo/view";
    }
}
