package com.smithexperience.lc.dto;

import java.math.BigDecimal;

public class AmountDTO {

	private BigDecimal billAmount;
	
	private String localeDef;

	public BigDecimal getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(BigDecimal billAmount) {
		this.billAmount = billAmount;
	}

	public String getLocaleDef() {
		return localeDef;
	}

	public void setLocaleDef(String localeDef) {
		this.localeDef = localeDef;
	}

	@Override
	public String toString() {
		return "AmountDTO [billAmount=" + billAmount + ", localeDef=" + localeDef + "]";
	}

	
	
	
}
