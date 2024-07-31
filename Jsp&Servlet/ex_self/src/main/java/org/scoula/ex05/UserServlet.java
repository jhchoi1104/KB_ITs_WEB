package org.scoula.ex05;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // MIME 타입 설정
        response.setContentType("text/html;charset=UTF-8");
        
        // 자바 I/O
        PrintWriter out = response.getWriter();
        
        // html 작성 및 출력
        out.print("<html><body>");
        out.print("");
        out.print("</body></html>");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        doGet(request,response);
    }
}
