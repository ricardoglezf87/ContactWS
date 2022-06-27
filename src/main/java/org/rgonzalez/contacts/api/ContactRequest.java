package org.rgonzalez.contacts.api;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;

public class ContactRequest {
	
	
	private Long id;
	
	@NotNull(message="El nombre es requerido")
	@Size(min=2,max=30, message="El nombre debe de tener entre {min} y {max} caracteres")
	private String firstName;
	private String lastName;
	
	@Pattern(regexp="^\\+[0-9]*$", message="El numero de telefono solo puede tener digitos inciando con el simbolo +")
	private String phoneNumber;
		
	private String email;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
