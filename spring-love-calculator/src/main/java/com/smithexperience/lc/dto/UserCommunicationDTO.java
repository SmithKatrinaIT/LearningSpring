package com.smithexperience.lc.dto;

public class UserCommunicationDTO {

	private String email;
	
	/**
	 * NESTED OBJECT CONCEPT:	
	 * 	-- UserCommunicationDTO is called inside UserRegistrationDTO
	 *  -- Phone is another class (object) being called inside this class (UserCommunication), which will
	 *  	be called from the UserRegisrationDTO class using the UserCommunicationDTO object
	 */
	private PhoneDTO phone;

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PhoneDTO getPhone() {
		return phone;
	}

	public void setPhone(PhoneDTO phone) {
		this.phone = phone;
	}
}
