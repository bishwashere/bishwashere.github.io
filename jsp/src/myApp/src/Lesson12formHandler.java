import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Lesson12formHandler extends HttpServlet{
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {
        // Handle form-data submission here.
        // Check Missing Name.
        //  If missing go back to form
        //  If not missing, Thank You message
        String fullName = request.getParameter("fullName");
        if (fullName=="" || fullName == null){
            // go back to the form page
            String errMsg = "<span style='color:red'>Your Name is required</span>";
            request.setAttribute("errMsg", errMsg);
            // forward back to the form servlet
            request.getRequestDispatcher("/ContactForm").forward(request, response);
        } else{
            // get and set in session
            HttpSession session = request.getSession(true);
            session.setAttribute("shoppingCartName", fullName+ "'s shopping cart");


            // go to greeting page
            String url ="lesson12greeter?fullName=" + fullName;
            response.sendRedirect(url); //HTTP response code 302
        }
    }
}