package edu.miu.cs.cs472.lesson13jspmvc.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchController
 */

@WebServlet(description = "SearchController", urlPatterns = { "/search-messages" })
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("<---SearchController doGet--->");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("<---SearchController doPost--->");
		System.out.println("SearchController search text:"+request.getParameter("searchText"));
		String referrer = request.getHeader("referer");
		if (referrer.contains("/home")){
			response.sendRedirect("home");
		}else {
			response.sendRedirect("contact-messages?searchText="+request.getParameter("searchText"));
		}
	}
	
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init();
    }

}
