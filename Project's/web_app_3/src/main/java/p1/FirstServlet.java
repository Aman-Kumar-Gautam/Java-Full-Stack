package p1;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FirstServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		System.out.println("First Get");
		*/
		
		/**/
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		String name = request.getParameter("name");
		RequestDispatcher rd = request.getRequestDispatcher("second");
		// How to aceess second web page using Reqest Dispatcher
		 * 
		request.setAttribute("name", name);
		RequestDispatcher rd = request.getRequestDispatcher("NewFile.html");
	
		rd.forward(request, response);
		*/
		
		/**/
		String name = request.getParameter("name");
		request.setAttribute("name", name);
		HttpSession session = request.getSession();
		
		session.setAttribute("sessionName", name); // To save data permenently in server	
		
		RequestDispatcher rd = request.getRequestDispatcher("second");	
		rd.forward(request, response);

		
	}

}
