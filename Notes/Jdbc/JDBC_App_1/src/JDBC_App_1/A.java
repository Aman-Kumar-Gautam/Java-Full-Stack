package JDBC_App_1;

import java.sql.*;

public class A {
	public static void main(String[] args) {
		try {
			// Connect to database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/july_batch_12", 
					"root", "test");
			System.out.println(con);
			// Write &run SQL Query in Java
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into registration values('Gautam','Goa','gautam@123.com','9994557771')");
			// stmnt.executeUpdate("Delete from registration WHERE email='aman@123.com'");
			// stmnt.executeUpdate("UPDATE registration SET mobile='1111111111' WHERE
			// email='mike@gmail.com'");
			ResultSet result = stmnt.executeQuery("select * from registration ");
			while (result.next()) {
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
				System.out.println(result.getString(4));

			}

			con.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
