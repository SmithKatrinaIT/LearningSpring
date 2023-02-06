package com.smithexperience.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;
import com.smithexperience.lc.dto.PhoneDTO;


/**
 * 
 * Formatter Interface: when you need to convert an object 
 *  -- several Formatters in the Java eco system
 *  -- using springframework.format.Formatter
 *  	-- extends Printer<t> and Parse<T>
 *
 */

public class LCPhoneNumberFormatter implements Formatter<PhoneDTO>{

	@Override
	public String print(PhoneDTO phone, Locale locale) {
		
		return phone.getCountryCode() + "-" + phone.getUserNumber();
		
	}

	@Override
	public PhoneDTO parse(String completePhoneNumber, Locale locale) throws ParseException {
		
		//split string received from the user
		String[] phoneArr = completePhoneNumber.split("-", 2);
		
		//Extract the countryCode, AreaCode and set it to the Phone class property
		PhoneDTO phoneDTO = new PhoneDTO();
		int index = completePhoneNumber.indexOf("-");
		
		if(index != -1 && phoneArr.length >=2 && phoneArr[0].length() <3) {
			phoneDTO.setCountryCode(phoneArr[0]);
			phoneDTO.setUserNumber(phoneArr[1]);
		}else if (index != -1  && phoneArr[0].length() == 3){
			phoneDTO.setCountryCode("1");
			phoneDTO.setUserNumber(completePhoneNumber);
		} else {
			phoneDTO.setCountryCode("1");
			phoneDTO.setUserNumber(completePhoneNumber);
		}
		
		return phoneDTO;
	}	
}
