package com.smithexperience.lc.dto;

public class BillDTO {
	
	private String creditCardNum;
	private String paymentAmount;
	
	
	public String getCreditCardNum() {
		return creditCardNum;
	}
	public void setCreditCardNum(String creditCardNum) {
		this.creditCardNum = creditCardNum;
	}
	public String getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	
	@Override
	public String toString() {
		return "BillDTO [creditCardNum=" + creditCardNum + ", paymentAmount=" + paymentAmount + "]";
	}
	
}
