package org.scoula.ex05;

import org.scoula.ex05.DTO.User;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userid = request.getParameter("userid");
        String passwd = request.getParameter("passwd");
        String birthday = request.getParameter("birthday");
        String age = request.getParameter("age");
        String habit = request.getParameter("habit");
        String star = request.getParameter("star");

        User user= new User(userid,passwd,birthday,age,habit,star);

//        request.setAttribute("user",user);

        HttpSession session = request.getSession();
        session.setAttribute("user",user);

        request.getRequestDispatcher("user.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        doGet(request, response);
    }
}
