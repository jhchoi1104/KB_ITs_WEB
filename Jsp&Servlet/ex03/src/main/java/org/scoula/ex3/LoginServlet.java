package org.scoula.ex3;

import org.scoula.ex3.dai.LoingDTO;
import org.scoula.ex3.dai.Member;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userid = request.getParameter("userid");
        String passwd = request.getParameter("passwd");

        LoingDTO loingDTO = new LoingDTO(userid, passwd);

        request.setAttribute("userid",userid);
        request.setAttribute("passwd",passwd);

        request.setAttribute("login",loingDTO);

        HttpSession session = request.getSession();
        Member member = new Member("홍길동", userid);
        session.setAttribute("user",member);

        request.getRequestDispatcher("login.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        doGet(request,response);
    }
}
