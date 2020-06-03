package edu.mum.cs.cs472.lab13.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContactFormController
 */
@WebServlet(description = "ContactFormController", urlPatterns = { "/contact-form" })
public class ContactFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int hitCount;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactFormController() {
        super();
    }
    
    private synchronized int incrHitCount() {
    	return this.hitCount++;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//hitCount++;
    	incrHitCount();
    	
		String customerName = request.getParameter("name");
		String gender = request.getParameter("gender");
		String category = request.getParameter("category");
		String message = request.getParameter("message");
		request.setAttribute("customerName",customerName);
		request.setAttribute("gender",gender);
		request.setAttribute("category",category);
		request.setAttribute("message",message);
    	
    	Object objTotalHitCount = getServletContext().getAttribute("totalHitCount");
        String totalHitCount = (objTotalHitCount != null) ? ((Integer)objTotalHitCount).toString() : "--";
    	request.setAttribute("contactHitCount",this.hitCount);
    	request.setAttribute("totalHitCount",totalHitCount);
    	request.getRequestDispatcher("/WEB-INF/views/contact-us.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
   
}
