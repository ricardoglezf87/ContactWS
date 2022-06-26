package org.rgonzalez.contacts.service;

import org.rgonzalez.contacts.dao.ContactRepository;
import org.rgonzalez.contacts.dto.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService{

	@Autowired
	ContactRepository contactsRepository;
	
	public Contact save(Contact contact) {
		return contactsRepository.saveAndFlush(contact);
	}
	
}
