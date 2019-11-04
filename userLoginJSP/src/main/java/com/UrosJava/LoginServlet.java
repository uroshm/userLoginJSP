package com.UrosJava;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login.do")

public class LoginServlet extends HttpServlet {

	private UserValidation uv1;
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,java.io.IOException {
		//INSECURE - passing variables through URL!
		//request.setAttribute("login", request.getParameter("login"));
		//request.setAttribute("pw", request.getParameter("pw"));		
		request.getRequestDispatcher("WEB-INF/views/Login.jsp").forward(request, response);
	
	}	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,java.io.IOException {
		uv1 = new UserValidation();
		String userName = request.getParameter("login");
		String pass = request.getParameter("pw");
		boolean isUserValid = uv1.userIsValid(userName, pass);
		if(isUserValid) {
			request.setAttribute("login",request.getParameter("login"));
			request.getRequestDispatcher("WEB-INF/views/welcome.jsp").forward(request, response);
		} else {
			request.setAttribute("errorMessage", "You have entered invalid credentials!");
			request.getRequestDispatcher("WEB-INF/views/Login.jsp").forward(request, response);
		}
	}
}
 