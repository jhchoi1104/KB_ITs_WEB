package org.scoula.ex05;

import org.scoula.ex05.DTO.LoginDTO;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userid = request.getParameter("userid");
        String passwd = request.getParameter("passwd");

        request.setAttribute("userid",userid);
        request.setAttribute("passwd",passwd);

        HttpSession session =request.getSession();

        LoginDTO loginDTO = new LoginDTO(userid,passwd);

        session.setAttribute("loginDTO",loginDTO);

        response.sendRedirect("user");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        doGet(request, response);
    }
}
