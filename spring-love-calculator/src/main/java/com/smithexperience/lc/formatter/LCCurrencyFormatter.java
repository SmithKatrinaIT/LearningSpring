package com.smithexperience.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.smithexperience.lc.dto.AmountDTO;
import com.smithexperience.lc.dto.CreditCardDTO;



/**
 * 
 * Formatter Interface: when you need to convert an object 
 *  -- several Formatters in the Java eco system
 *  -- using springframework.format.Formatter
 *  	-- extends Printer<t> and Parse<T>
 *
 */

public class LCCurrencyFormatter implements Formatter<AmountDTO>{

	@Override
	public String print(AmountDTO amount, Locale locale) {	
		
		return null;
	}

	@Override
	public AmountDTO parse(String amount, Locale locale) throws ParseException {
		
		AmountDTO amountDto = new AmountDTO();
		
		return amountDto;
	}	
}
