package w3d1.servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ContactUsForm
 */
@WebServlet("/contact-us-form")
public class ContactUsForm extends HttpServlet {
	private int pageHitCount;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ContactUsForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("<!doctype html>\n" + 
				"<html lang=\"en\">\n" + 
				"<head>\n" +
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
				"		<a class=\"navbar-brand\" href=\"\">CS472-WAP ::: Assignment 11</a>\n" + 
				"		<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\n" + 
				"			data-target=\"#navbarSupportedContent\"\n" + 
				"			aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\n" + 
				"			aria-label=\"Toggle navigation\">\n" + 
				"			<span class=\"navbar-toggler-icon\"></span>\n" + 
				"		</button>\n" + 
				"\n" + 
				"		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n" + 
				"			<ul class=\"navbar-nav mr-auto\">\n" + 
				"				<li class=\"nav-item\">\n" + 
				"					<a class=\"nav-link\" href=\"index.jsp\">\n" +
				"						Home\n" + 
				"						<span class=\"sr-only\">(current)</span>\n" + 
				"					</a>\n" + 
				"				</li>\n" + 
				"				<li class=\"nav-item\">\n" + 
				"					<a class=\"nav-link\" href=\"#\">About</a>\n" + 
				"				</li>\n" + 
				"				<li class=\"nav-item\">\n" + 
				"					<a class=\"nav-link active\" href=\"contact-us-form\">Contact Us</a>\n" + 
				"				</li>\n" + 
				"			</ul>\n" + 
				"			<form class=\"form-inline my-2 my-lg-0\">\n" + 
				"				<input class=\"form-control mr-sm-2\" type=\"search\"\n" + 
				"					placeholder=\"Search\" aria-label=\"Search\">\n" + 
				"				<button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n" + 
				"			</form>\n" + 
				"		</div>\n" + 
				"	</nav>\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"	<div class=\"w-75 m-auto\">\n" + 
				"		<h4 class=\"mt-3 mb-3\">Customer Contact Form</h4>\n");
		if(request.getAttribute("errors") != null) {
			String[] errors = (String[])request.getAttribute("errors");
			for(String error:errors) {
				if(error!=null) {
					response.getWriter().append("<div class=\"d-block invalid-feedback\">"+error+"</div>");
				}
			}
		}

		response.getWriter().append(
				"		<form method=\"POST\" action=\"form-validation\" class=\"mt-3\">\n" + 
						"			<div class=\"form-group\">\n" + 
						"				<label for=\"name\">*Name</label>\n" + 
						"				<input type=\"text\" class=\"form-control\" name=\"name\" id=\"name\"\n" + 
						"					 placeholder=\"John H Smith\">\n" + 
						"			</div>\n" + 
						"			<div class=\"form-group\">\n" + 
						"				<label>*Gender</label>\n" + 
						"				<div class=\"form-check\">\n" + 
						"					<input class=\"form-check-input\" type=\"radio\" name=\"gender\"\n" + 
						"						id=\"gender-male\" value=\"Male\">\n" + 
						"					<label class=\"form-check-label mr-5\" for=\"gender-male\">Male</label>\n" + 
						"\n" + 
						"					<input class=\"form-check-input\" type=\"radio\" name=\"gender\"\n" + 
						"						id=\"gender-female\" value=\"Female\">\n" + 
						"					<label class=\"form-check-label\" for=\"gender-female\">Female</label>\n" + 
						"				</div>\n" + 
						"			</div>\n" + 
						"			<div class=\"form-group\">\n" + 
						"				<label for=\"category\">*Category</label>\n" + 
						"				<select class=\"form-control\" id=\"category\" name=\"category\">\n" + 
						"					<option value=\"\">select</option>\n" + 
						"					<option value=\"Feedback\">Feedback</option>\n" + 
						"					<option value=\"Inquiry\">Inquiry</option>\n" + 
						"					<option value=\"Complaint\">Complaint</option>\n" + 
						"				</select>\n" + 
						"			</div>\n" + 
						"			<div class=\"form-group\">\n" + 
						"				<label for=\"message\">*Message</label>\n" + 
						"				<textarea class=\"form-control\" id=\"message\" name=\"message\" rows=\"3\"></textarea>\n" + 
						"			</div>\n" + 
						"			<div class=\"form-group\">\n" + 
						"				<button type=\"submit\" class=\" w-100 btn btn-primary\">Submit</button>\n" + 
						"			</div>\n" + 
						"		</form>\n" + 
						"\n" + 
						"	</div>\n "
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
