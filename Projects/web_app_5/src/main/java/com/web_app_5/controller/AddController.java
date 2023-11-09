package com.web_app_5.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web_app_5.model.Add;

@WebServlet("/addController")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher requestDispatcher;

	public AddController() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		Add add = new Add();
		int result = add.addNumber(num1, num2);
		
		request.setAttribute("res", result);
		RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
		rd.forward(request, response);
		
	}

}
