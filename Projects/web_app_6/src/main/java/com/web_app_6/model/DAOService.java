package com.web_app_6.model;

public interface DAOService {
	public void connectDB();
	public boolean verifyCredentials(String email, String password);
	public void createRegistration(String name, String city, String email, String mobile);
}
