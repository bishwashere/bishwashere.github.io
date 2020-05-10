import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(
    urlPatterns = {
        "/Lesson12GreeterServlet",
        "/lesson12greeter"
    }
)
public class Lesson12GreeterServlet extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {
        String fullName = request.getParameter("fullName");
        StringBuilder sb = new StringBuilder();
        sb.append("<h3> Hello, " + fullName + "</h3>");
        sb.append((String)request.getSession().getAttribute("shoppingCartName"));
        sb.append("<br>");
        sb.append((String)request.getServletContext().getAttribute("AppName"));
        response.setContentType("text/html");
        response.getWriter().println(sb.toString());
    }
}