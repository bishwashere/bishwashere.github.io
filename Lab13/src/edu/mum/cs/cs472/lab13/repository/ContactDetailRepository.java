package edu.mum.cs.cs472.lab13.repository;

import edu.mum.cs.cs472.lab13.model.ContactDetail;

public class ContactDetailRepository {
	
	final static ContactDetail contactDetail=new ContactDetail();

	public void saveContactDetailsToRepository(String customerName, String gender, String category, String message) {
		 System.out.println("ContactDetailRepository >>>name= "+ customerName + ", gender= " + gender + ", cat= " + category + ", msg= " + message);
		contactDetail.setCategory(category);
		contactDetail.setCustomerName(customerName);
		contactDetail.setGender(gender);
		contactDetail.setMessage(message);
		System.out.println("ContactDetailRepository Save-->");
	}
	
	public ContactDetail fetchContactDetail() {
		System.out.println("contactDetail Name-->"+contactDetail.getCustomerName());
		return contactDetail;
	}

}
