package com.marketingapp.dto;

public class RegistrationDto {
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	private String firstName;
	private String lastName;
	private String email;
	private long mobile;
	private long Id;
}
