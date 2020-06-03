package w3d1.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ThankYou
 */
@WebServlet("/thank-you")
public class ThankYou extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int pageHitCount;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThankYou() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<!doctype html>\n" + 
				"<html lang=\"en\">\n" + 
				"<head>\n" + 
				"<!-- Required meta tags -->\n" + 
				"<meta charset=\"utf-8\">\n" + 
				"<meta name=\"viewport\"\n" + 
				"	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" + 
				"\n" + 
				"<!-- Bootstrap CSS -->\n" + 
				"<link rel=\"stylesheet\"\n" + 
				"	href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\"\n" + 
				"	integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\"\n" + 
				"	crossorigin=\"anonymous\">\n" + 
				"\n" + 
				"<title>CS472-W3D1 - Assignment 11 - Java Servlet</title>\n" + 
				"</head>\n" + 
				"<body>\n" + 
				"	<nav class=\"navbar navbar-expand-sm navbar-dark bg-primary\">\n" + 
				"		<a class=\"navbar-brand\" href=\"#\">CS472-WAP ::: Assignment 11</a>\n" + 
				"		<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\n" + 
				"			data-target=\"#navbarSupportedContent\"\n" + 
				"			aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\n" + 
				"			aria-label=\"Toggle navigation\">\n" + 
				"			<span class=\"navbar-toggler-icon\"></span>\n" + 
				"		</button>\n" + 
				"\n" + 
				"		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n" + 
				"			<ul class=\"navbar-nav mr-auto\">\n" + 
				"\n" + 
				"			</ul>\n" + 
				"		</div>\n" + 
				"	</nav>\n" + 
				"\n" + 
				"\n" + 
				"	<div class=\"card w-75 mt-3 ml-auto mr-auto\">\n" + 
				"		<h5 class=\"card-header\">Thank you! Your message has been received as follows</h5>\n" + 
				"		<div class=\"card-body\">\n" + 
				"			<h5 class=\"card-title\">Name: "+request.getParameter("name")+"</h5>\n" + 
				"			<p class=\"card-text\">Gender: "+request.getParameter("gender")+"</p>\n" + 
				"			<p class=\"card-text\">Category: "+request.getParameter("category")+" </p>\n" + 
				"			<p class=\"card-text\">Message: "+request.getParameter("message")+" </p>\n" + 
				"			Please feel free to <a href=\"contact-us-form\" >Contact Us</a> again\n" + 
				"		</div>\n" + 
				"	</div>\n" + 
				"\n" 
				+ "<div class=\"w-75 mt-5 ml-auto mr-auto text-secondary\">\n" + 
				"		<div class=\"float-left\">Hit Count for this page: "+ ++pageHitCount +"</div>\n" + 
				"		<div class=\"float-right\">Total Hit Count for the entire WebApp: "+request.getAttribute("webHitCount")+"</div>\n" + 
				"	</div>" + 
				"	<!-- Optional JavaScript -->\n" + 
				"	<!-- jQuery first, then Popper.js, then Bootstrap JS -->\n" + 
				"	<script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\"\n" + 
				"		integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\"\n" + 
				"		crossorigin=\"anonymous\"></script>\n" + 
				"	<script\n" + 
				"		src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"\n" + 
				"		integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\"\n" + 
				"		crossorigin=\"anonymous\"></script>\n" + 
				"	<script\n" + 
				"		src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"\n" + 
				"		integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\"\n" + 
				"		crossorigin=\"anonymous\"></script>\n" + 
				"</body>\n" + 
				"</html>");
	}
}
