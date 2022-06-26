package org.rgonzalez.contacts.api;

import org.rgonzalez.contacts.dto.Contact;
import org.rgonzalez.contacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactApi {
	
	
	@Autowired
	ContactService contactService;
	
	@RequestMapping(value = "/getcontact",method = RequestMethod.GET)
	public Contact getByID() {
		return new Contact(1L,"Jhon","Doe","+57 311 222 3344", "jhon@rgonzalez.com");
	}

	@RequestMapping(value = "/contact",method = RequestMethod.POST)
	public Contact updateorSave(@RequestBody Contact contact) {	
		return contactService.save(contact);
	}
	
}