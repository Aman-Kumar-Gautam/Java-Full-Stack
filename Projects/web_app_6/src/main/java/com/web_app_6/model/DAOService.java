package com.web_app_6.model;

import java.sql.ResultSet;

public interface DAOService {
	public void connectDB();
	public boolean verifyCredentials(String email, String password);
	public void createRegistration(String name, String city, String email, String mobile);
	public ResultSet readRegistration();
	public void deleteRegistration(String email);
}
