package edu.miu.cs.cs472.lesson13jspmvc.controller;

import edu.miu.cs.cs472.lesson13jspmvc.model.ContactMessage;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Servlet implementation class ContactMessageController
 */
@WebServlet(description = "ContactMessageController", urlPatterns = { "/contact-messages" })
public class ContactMessageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactMessageController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        List<ContactMessage> contactMessages = Arrays.asList(
            	new ContactMessage("John H. Smith", "Male", "Feedback", "This is a feedback"),
            	new ContactMessage("Anna Jones", "Female", "Inquiry", "This is an inquiry"),
            	new ContactMessage("Bob W. Adamson", "Male", "Complaint", "This is a compliant"),
            	new ContactMessage("Zacary Najib Ali", "Male", "Inquiry", "This is an inquiry"),
            	new ContactMessage("Carlos Hernandez", "Male", "Inquiry-Owais", "This is an inquiry"),
            	new ContactMessage("Tuyen Le Nguyen", "Female", "Feedback", "This is an feedback")
            );
      
//        Search Data First
        if(!(request.getParameter("searchText")==null || request.getParameter("searchText")=="" )) {
        	contactMessages = contactMessages.stream()
            .filter(item -> item.toString().toLowerCase().contains(request.getParameter("searchText").toString().toLowerCase()))
            .collect(Collectors.toList());
        }
        // Sort data first
        List<ContactMessage> sortedContactMessages = contactMessages.stream()
        	.sorted(Comparator.comparing(ContactMessage::getCustomerName))
        	.collect(Collectors.toList());
        
		request.setAttribute("contactMessages", sortedContactMessages);
		request.getRequestDispatcher("/WEB-INF/views/contact-messages.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init();
    }

}
