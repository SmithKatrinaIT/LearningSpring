package com.smithexperience.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smithexperience.lc.dto.AmountDTO;
import com.smithexperience.lc.dto.BillDTO;
import com.smithexperience.lc.dto.PhoneDTO;
import com.smithexperience.lc.dto.UserCommunicationDTO;
import com.smithexperience.lc.dto.UserInfoDTO;
import com.smithexperience.lc.dto.UserRegistrationDTO;

@Controller
public class LCRegistrationController {

	/**
	 * Assignment:
	 * form:
	 * JSR: Java Specification Request
	 * 	--	3 Main JSR: 303, 349, 380
	 * 	-- JCP: Java Community Process
	 * 
	 * NOTE:  @RequestMapping("API-Endpoint-value/name") <-- this is the landing page
	 * 		  return "page-name" <-- this is the page name before clicking submit button or redirect link/button is clicked 
	 * 		  [often the API end-point name and the return "page-name" are the same but don't have to be
	 */
	
	@RequestMapping("/") 
	public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfo) {
				
		return "home-page";
	}
	
	
	
	@RequestMapping("/process-homepage")
	public String showLoginPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfo, BindingResult result) {
		
		if(result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			for(ObjectError temp : allErrors) {
				System.out.println(temp);
			}
			return "home-page";
		}
		return "login-page";
	}
	
	@RequestMapping("/register") 
	public String showRegistrationPage(@ModelAttribute("userData") UserRegistrationDTO userRegDTO) {
		
		//TODO: Load saved User Register details from the DB [so user can edit it]
		
		//hard-coded here for demo purposes
		PhoneDTO phone = new PhoneDTO();
		phone.setCountryCode("1");
		phone.setUserNumber("678-227-2157");
		
		UserCommunicationDTO userCommDTO = new UserCommunicationDTO();
		userCommDTO.setPhone(phone);
		
		userRegDTO.setUserCommDTO(userCommDTO);
		
		return "registration-page";
	}
	
	@RequestMapping("/registration-success")
	public String processUserRegistration(@Valid @ModelAttribute("userData") UserRegistrationDTO userInfodto, BindingResult result) {
		
		//TODO: Save the Registration Data to the DB
		
		if(result.hasErrors()) {
			System.out.println("My registration pages has errors");
			
			List<ObjectError> allErrors = result.getAllErrors();
			
			for(ObjectError error : allErrors) {
				System.out.println(error);
			}
			return "registration-page";
		}
		
		return "registration-success";
	}
	
	@RequestMapping("/payment")
	public String getUserPayment(@ModelAttribute("userPayment") BillDTO creditCard, AmountDTO amount) {
		return "payment";
	}
	
	@RequestMapping("/process-payment")
	public String processUserPayment(@ModelAttribute("userPayment") BillDTO creditCard, AmountDTO amount) {
		
		
		return "process-payment";
	}
	
	
	
}