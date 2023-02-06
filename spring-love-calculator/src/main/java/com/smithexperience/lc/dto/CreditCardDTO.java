package com.smithexperience.lc.dto;

import java.util.List;

public class CreditCardDTO {
	
	private Integer firstSetDigits;
	private Integer secondSetDigits;
	private Integer thirdSetDigits;
	private Integer forthSetDigits;

	
	public Integer getFirstSetDigits() {
		return firstSetDigits;
	}
	public void setFirstSetDigits(Integer firstSetDigits) {
		this.firstSetDigits = firstSetDigits;
	}
	public Integer getSecondSetDigits() {
		return secondSetDigits;
	}
	public void setSecondSetDigits(Integer secondSetDigits) {
		this.secondSetDigits = secondSetDigits;
	}
	public Integer getThirdSetDigits() {
		return thirdSetDigits;
	}
	public void setThirdSetDigits(Integer thirdSetDigits) {
		this.thirdSetDigits = thirdSetDigits;
	}
	public Integer getForthSetDigits() {
		return forthSetDigits;
	}
	public void setForthSetDigits(Integer forthSetDigits) {
		this.forthSetDigits = forthSetDigits;
	}
	
	@Override
	public String toString() {
		return firstSetDigits + "-" + secondSetDigits + "-" + thirdSetDigits + "-" + forthSetDigits;
	}
	
	

}
