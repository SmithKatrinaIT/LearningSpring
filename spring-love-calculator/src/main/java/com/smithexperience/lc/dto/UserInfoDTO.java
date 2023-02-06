package com.smithexperience.lc.dto;

import java.util.Arrays;
import java.util.List;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

	@NotBlank(message = " * Crush Name can't be blank")
	@Size(min=3, max=15, message=" * Your Crush Name should have between 3 and 15 characters")
	private String crushName;
	
	@NotBlank(message = " * Your Name can't be blank")
	@Size(min=3, max=15, message=" * Your Name should have between 3 and 15 characters")
	private String userName;
	
	@AssertTrue(message= " * Must Agree you use our app")
	private boolean termAndCondition;
	
	
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean isTermAndCondition() {
		return termAndCondition;
	}
	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}
	@Override
	public String toString() {
		return "UserInfoDTO [crushName=" + crushName + ", userName=" + userName + ", termAndCondition="
				+ termAndCondition + "]";
	}
	
	
	
	

	
	
	
	
}
