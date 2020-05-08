package edu.mum.cs.cs472.lab13.service;

import edu.mum.cs.cs472.lab13.model.ContactDetail;
import edu.mum.cs.cs472.lab13.repository.ContactDetailRepository;

public class ContactDetailService {
	
	ContactDetailRepository contactDetailRepository=new ContactDetailRepository();

	public void saveContactDetails(String customerName, String gender, String category, String message) {
		System.out.println("ContactDetailService Save-->");
		contactDetailRepository.saveContactDetailsToRepository(customerName,gender,category,message);
		
	}
	
	public ContactDetail getContactDetail() {
		return contactDetailRepository.fetchContactDetail();
	}


}
