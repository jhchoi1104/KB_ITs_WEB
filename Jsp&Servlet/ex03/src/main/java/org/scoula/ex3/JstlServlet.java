package org.scoula.ex3;

import org.scoula.ex3.dai.Member;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/jstl_ex")
public class JstlServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Member> members = new ArrayList<>();
        for (int i=0;i<10;i++) {
            Member member = new Member("홍길동_"+i,"hong_"+i);
            members.add(member);
        }

        request.setAttribute("members",members);
        request.setAttribute("role","ADMIN");

        request.getRequestDispatcher("jstl_ex.jsp")
                .forward(request,response);
    }
}
