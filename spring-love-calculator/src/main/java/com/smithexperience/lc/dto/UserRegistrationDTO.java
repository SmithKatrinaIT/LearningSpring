package com.smithexperience.lc.dto;

import java.util.Arrays;

import com.smithexperience.lc.validators.Age;

public class UserRegistrationDTO {
	
		private String fullName;
		private String userName;
		private char[] password;
		private String country;
		private String[] hobby;
		private String gender;
		
		
		@Age(lower = 30, upper = 75, message = "the age should be between 30-75")
		private Integer age;
		
		
		/**
		 * NESTED OBJECTS CONCEPT:
		 * -- create a property of type <object>
		 * -- in the View use the object property name as usual, but call the other object property(ies) like 
		 * -- you would a method (without the parenthesis)
		 */
		private UserCommunicationDTO userCommDTO;
		
		
		
		public String getFullName() {
			return fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		
		public char[] getPassword() {
			return password;
		}
		public void setPassword(char[] password) {
			this.password = password;
		}

		public String[] getHobby() {
			return hobby;
		}
		public void setHobby(String[] hobby) {
			this.hobby = hobby;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public UserCommunicationDTO getUserCommDTO() {
			return userCommDTO;
		}
		public void setUserCommDTO(UserCommunicationDTO userCommDTO) {
			this.userCommDTO = userCommDTO;
		}
		@Override
		public String toString() {
			return "UserRegistrationDTO [fullName=" + fullName + ", userName=" + userName + ", password="
					+ Arrays.toString(password) + ", country=" + country + ", hobby=" + Arrays.toString(hobby)
					+ ", gender=" + gender + ", age=" + age + ", userCommDTO=" + userCommDTO + "]";
		}
		
		
		
		

}
