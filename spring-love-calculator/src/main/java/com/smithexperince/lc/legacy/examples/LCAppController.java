package com.smithexperince.lc.legacy.examples;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smithexperience.lc.dto.UserInfoDTO;

////@Controller //commented out for Assignment testing
public class LCAppController {

	/**
	 * CONCEPT: Data binding with Spring MVC 
	 * 	--form tags helps with 2-way Data binding
	 * 		form:form
	 * 		form:input
	 * 		form:select
	 * 	-- with Spring MVC tags; 'path=' is used in place of 'name='
	 * 		-- 'path=' value must match the defined DTO object property name
	 */
	
	
	
	/**
	 * SPRING MVC Approach:
	 * 
	 * Pass the @ModelAttribute directly instead of the Model object, then calling its methods within the
	 * block of code.
	 * 
	 * @ModelAttribute syntax: (@ModelAttribute(modelAttributeName) DTOObjectClassName dtoObjectName)
	 * 	-- modelAtrributeName can be anything; but it is the name name used in identifying
	 * 	-- the data to be bound in the form
	 * 		-- i.e. <form:form modelAttribute="modelAttributeName">
	 */
	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfodto) {
		
		return "home-page";
	}
	
	@RequestMapping("/process-homepage") 
	public String showResultPage(@ModelAttribute("userInfo") UserInfoDTO userInfodto){
		
		return "result-page";
	}
	
	
	
	
	
	
	/**
	 * ======================== LEGECY EXAMPLES - 1ST APPROACH ============================ 
	 *  =======UNDERSTANDING THE PROCESS BEFOR SPRING FRAMEWORK IMPLEMENTATION ============
	 */
	
	@RequestMapping("/Legacy")
	public String showHomePageLegacy(Model model) {
		
		//read the existing value from the DTO
		UserInfoDTO userInfo = new UserInfoDTO();
		
		model.addAttribute("userInfo", userInfo);
		
		return "home-page";
	}
	
	/**
	 * No need for @RequestParam annotations
	 * Instead create the class object
	 */
	@RequestMapping("/process-homepageLegacy2") 
	public String showResultPageLegacy2(UserInfoDTO userInfoDTO, Model model){
		
		//writing to the value to the property by fetching from the URL (get request)
		//System.out.println("user name is: " + userInfoDTO.getUserName());
		//System.out.println("crush name is: " + userInfoDTO.getCrushName());
		
		model.addAttribute("userInfo", userInfoDTO);
		
		
		return "result-page";
	}
	
	
	
	
	
	/**(
	 * @RequestParam: can be used to bind user input [ data binding ]; However this can be a lot of code if 
	 * data is extensive
	 * 
	 * MVC Spring framework standard way for data binding uses POJO [plain old Java object] and DTO [data transfer object]
	 *  -- Spring will automatically bind the data to the POJO/DTO class properties/variables
	 */
	@RequestMapping("/process-homepageLegacy") 
	public String showResultPageLegacy(@RequestParam("userName") String userName1, @RequestParam("crushName") String crushName1, Model model){
		
		System.out.println("user name is: " + userName1);
		System.out.println("crush name is: " + crushName1);
		
		model.addAttribute("userName", userName1);
		model.addAttribute("crushName", crushName1);
		
		return "result-page";
	}
	
	
	
	
	
}
