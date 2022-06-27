package org.rgonzalez.contacts.api;

import javax.validation.Valid;

import org.dozer.Mapper;
import org.rgonzalez.contacts.dto.Contact;
import org.rgonzalez.contacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactApi {
	
	
	@Autowired
	ContactService contactService;
	
	@Autowired
	Mapper mapper;
	
	@RequestMapping(value = "/contact/{id}",method = RequestMethod.GET)
	public ContactResponse getByID(@PathVariable Long id) {
		return mapper.map(contactService.get(id), ContactResponse.class);
	}

	@RequestMapping(value = "/contact",method = RequestMethod.POST)
	public ContactResponse updateorSave(@RequestBody @Valid ContactRequest contactRequest) {		
		Contact contact = mapper.map(contactRequest, Contact.class);		
		Contact contactUpdate = contactService.save(contact);		
		return mapper.map(contactUpdate, ContactResponse.class);
	}
	
}