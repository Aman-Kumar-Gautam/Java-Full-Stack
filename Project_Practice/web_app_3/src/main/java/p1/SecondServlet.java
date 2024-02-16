package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SecondServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		String name = request.getParameter("name");
		request.setAttribute("name", name);
		RequestDispatcher rd = request.getRequestDispatcher("first");
		rd.forward(request, response);
		*/
		
		String name = (String) request.getAttribute("name");
		System.out.println(name);
		HttpSession session = request.getSession();
		System.out.println(session.getAttribute("sessionName"));
		
		session.invalidate();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		System.out.println("Second Post");
		*/
		String name = (String) request.getAttribute("name");
		System.out.println(name);
		HttpSession session = request.getSession();
		System.out.println(session.getAttribute("sessionName"));
		session.invalidate(); 	// To remove Data
	}

}
