package p1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Registration() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	 {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	{
		String name = request.getParameter("firstName");
		String city = request.getParameter("cityName");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/july_batch_12","root","test");
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into registration values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
		
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
