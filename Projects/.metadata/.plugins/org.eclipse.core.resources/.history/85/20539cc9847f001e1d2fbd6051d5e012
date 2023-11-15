package com.web_app_6.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web_app_6.model.DAOService;
import com.web_app_6.model.DAOServiceImpl;


@WebServlet("/verifyLogin")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		DAOService service = new DAOServiceImpl();
		service.connectDB();
		boolean status = service.verifyCredentials(email, password);
		if (status) { 
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/create_registration.jsp");
			rd.forward(request, response);
		
		}
		
		
		
		
		// System.out.println(status);
	}

}
