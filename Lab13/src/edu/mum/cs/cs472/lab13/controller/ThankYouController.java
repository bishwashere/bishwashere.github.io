package edu.mum.cs.cs472.lab13.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.mum.cs.cs472.lab13.model.ContactDetail;
import edu.mum.cs.cs472.lab13.service.ContactDetailService;

/**
 * Servlet implementation class ThankYouController
 */
@WebServlet(description = "ThankYouController", urlPatterns = { "/thankyou" })
public class ThankYouController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int hitCount;
       
	ContactDetailService contactDetailService= new ContactDetailService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThankYouController() {
        super();
    }
    
    @Override
    public void init() throws ServletException {
        super.init();
    }
    
    private synchronized int incrHitCount() {
    	return this.hitCount++;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		incrHitCount();
        Object objTotalHitCount = getServletContext().getAttribute("totalHitCount");
        String totalHitCount = (objTotalHitCount != null) ? ((Integer)objTotalHitCount).toString() : "--";
		ContactDetail contactDetail=contactDetailService.getContactDetail();
		request.setAttribute("contactDetail", contactDetail);
		request.setAttribute("thankHitCount",this.hitCount);
		request.setAttribute("totalHitCount",totalHitCount);
		request.getRequestDispatcher("/WEB-INF/views/thank-you.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
