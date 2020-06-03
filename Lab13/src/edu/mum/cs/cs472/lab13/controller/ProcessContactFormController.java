package edu.mum.cs.cs472.lab13.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.mum.cs.cs472.lab13.service.ContactDetailService;

/**
 * Servlet implementation class ProcessContactFormController
 */
@WebServlet(name="ProcessContactFormController", urlPatterns = {"/process-contact-form"})
public class ProcessContactFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ContactDetailService contactDetailService= new ContactDetailService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessContactFormController() {
        super();
    }
    
    @Override
    public void init() throws ServletException {
        super.init();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("contact-form");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String missingFieldsMsg = "";
        String[] errors = new String[4];

		String customerName = request.getParameter("name");
		String gender = request.getParameter("gender");
		String category = request.getParameter("category");
		String message = request.getParameter("message");
		 // Check for missing fields data
		if(customerName == null || customerName.isEmpty()) {
			errors[0]= "Name is missing";
			missingFieldsMsg += "<span style='color:red;font-size:1em'>Name is missing.</span><br/>";
		}
		
		if(gender == null || gender.isEmpty()) {
			errors[1]= "Gender is missing";
			 missingFieldsMsg += "<span style='color:red;'>Gender is missing.</span><br/>";
		}
		
		if(category == null || category.isEmpty()) {
			errors[2]= "Category is missing";
			missingFieldsMsg += "<span style='color:red;'>Category is missing.</span><br/>";
		}
		
		if(message == null || message.isEmpty()) {
			errors[3]= "Message is missing";
			 missingFieldsMsg += "<span style='color:red;'>Message is missing.</span><br/>";
		}

		request.setAttribute("errors", errors);
		
        System.out.println("name= "+ customerName + ", gender= " + gender + ", cat= " + category + ", msg= " + message);
       

        if(!missingFieldsMsg.equals("")) {
            // forward back to sender
            RequestDispatcher rd = request.getRequestDispatcher("/contact-form");
            rd.forward(request, response);
        } else {
        	contactDetailService.saveContactDetails(customerName,gender,category,message);
            String redirectUrl = "thankyou";
            response.sendRedirect(redirectUrl);
        }
	}

}
