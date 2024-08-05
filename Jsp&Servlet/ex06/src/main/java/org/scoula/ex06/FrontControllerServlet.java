package org.scoula.ex06;

import org.scoula.ex06.command.Command;
import org.scoula.ex06.controller.HomeController;
import org.scoula.ex06.controller.TodoController;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name= "frontControllerServlet", value="/")
public class FrontControllerServlet extends DispatcherServlet {
    // url을 나타내는 String과 그때 실행할 Command을 맵으로 저장한다.
    // get 요청인지, post 요청인지에 따라 map을 다르게 지정한다.
    Map<String, Command> getMap;
    Map<String, Command> postMap;

    String prefix = "/WEB-INF/views/";
    String suffix = ".jsp";

    HomeController homeController = new HomeController();
    TodoController todoController = new TodoController();
    @Override
    protected void createMap(Map<String, Command> getMap, Map<String, Command> postMap) {
        getMap.put("/",homeController::getIndex);
        getMap.put("/todo/list", todoController::getList);
    }


    private String getCommandName(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        String contextPath = request.getContextPath();
        return requestURI.substring(contextPath.length());
    }
    private Command getCommand(HttpServletRequest request) {
        String commandName = getCommandName(request);
        Command command;
        if(request.getMethod().equalsIgnoreCase("GET")) {
            command = getMap.get(commandName);
        } else {
            command = postMap.get(commandName);
        }
        return command;
    }
    public void execute(Command command, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String viewName = command.execute(request, response);
        if(viewName.startsWith("redirect:")) {
            response.sendRedirect(viewName.substring("redirect:".length()));
        } else {
            String view = prefix+viewName+suffix;
            RequestDispatcher dis = request.getRequestDispatcher(view);
            dis.forward(request,response);
        }
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Command command = getCommand(request);
        if (command != null) {
            execute(command, request, response);
        } else {
            String view = prefix+"404"+suffix;
            RequestDispatcher dis = request.getRequestDispatcher(view);
            dis.forward(request,response);
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
