package com.web_app_6.model;

import java.sql.*;

public  class DAOServiceImpl implements DAOService {
	private Connection con;
	private Statement stmnt;
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mylogindb","root","test");
			stmnt = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public boolean verifyCredentials(String email, String password) {
		try {

			ResultSet result = stmnt .executeQuery("select * from login where email='"+email+"' and password='"+password+"'");
			return result.next();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return false;
	}


	@Override
	public void createRegistration(String name, String city, String email, String mobile) {
		try {

			stmnt.executeUpdate("insert into registration values('"+name+"','"+city+"','"+email+"','"+mobile+"')");			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
