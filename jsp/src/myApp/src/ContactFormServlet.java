import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class ContactFormServlet extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css' integrity='sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T' crossorigin='anonymous'>");
        out.println("<title>Document</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<header>");
        out.println("<nav class='navbar navbar-dark bg-primary'>");
        out.println("<div>");
        out.println("<p class='text-light'>");
        out.println("CS472-WAP ::: Lab10 ::: Home About Contact Us");
        out.println("</p>");
        out.println("</div>");
        out.println("<span class='pull-right'>");
        out.println("<span class='text-light'>");
        out.println("Hello");
        out.println("</span>");
        out.println("<button>");
        out.println("Sign Out");
        out.println("</button>");
        out.println("</span>");
        out.println("");
        out.println("</header>");
        out.println("</nav>");
        out.println("<main style='margin-right:10%; margin-left:10%'>");
        out.println("<form method='POST' action='Lesson12formHandler'>");
        Object objErrMsg = request.getAttribute("errMsg");
        if(objErrMsg != null){
            String strErrMsg = (String)objErrMsg;
            out.println(strErrMsg);
        }
        out.println("<h1>Customer Contact Form</h1>");
        out.println("<div class='form-row'>");
        out.println("<div class='form-group col-md-12'>");
        out.println("<label for='fullName'>*Name</label>");
        out.println("<input type='text' class='form-control' id='fullName' aria-describedby='emailHelp' placeholder='e.g: John Smith'>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class='form-group col-md-3'>");
        out.println("<label for='productName'>*Gender</label>");
        out.println("<div class='form-check'>");
        out.println("<input class='form-check-input' type='radio' name='exampleRadios' id='isOutPatient' value='True'>");
        out.println("<label class='form-check-label' for='isOutPatient'>");
        out.println("Male&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
        out.println("<input class='form-check-input' type='radio' name='exampleRadios' id='exampleRadios1' value='False'>");
        out.println("<label class='form-check-label' for='exampleRadios1'>");
        out.println("Female");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class='form-row'>");
        out.println("");
        out.println("<div class='form-group col-md-12'>");
        out.println("<label for='supplierName'>Category</label>");
        out.println("<select id='supplierName' class='form-control'>");
        out.println("<option>MIU</option>");
        out.println("<option>MUM</option>");
        out.println("</select>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class='form-row'>");
        out.println("<div class='form-group col-md-12'>");
        out.println("<label for='unitPrice'>Message</label>");
        out.println("<label for='exampleFormControlTextarea1'></label>");
        out.println("<textarea class='form-control' id='exampleFormControlTextarea1' rows='3'></textarea>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class='form-row'>");
        out.println("<div class='form-group col-md-12'>");
        out.println("<input type='submit' class='btn btn-primary btn-lg btn-block'>");
        out.println("");
        out.println("</div>");
        out.println("</div>");
        out.println("<p> Hit count for this page: 19</p>");
        out.println("</form>");
        out.println("</main>");
        out.println("<footer>");
        out.println("</footer>");
        out.println("</body>");
        out.println("</html>");
        
        Cookie cookie = new Cookie("defaultNname", "NoName");
        cookie.setMaxAge(10);
        response.addCookie(cookie);
    }
}