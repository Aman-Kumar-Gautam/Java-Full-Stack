package JDBC_App_1;



import java.sql.*;

//'"+variable name+" for input variable
public class B {
	public static void main(String[] args) {
		Connection con = null;
		try {
			// Connect to database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/july_batch_12", "root", "test");
			System.out.println(con);
			// Write &run SQL Query in Java
			Statement stmnt = con.createStatement();
			// stmnt.executeUpdate("insert into registration
			// values('Aman','Bangalore','aman@123.com','9995557771')");
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

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
