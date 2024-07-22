package org.techhub.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.techhub.model.LoginModel;
import org.techhub.service.LoginService;
import org.techhub.service.LoginServiceImpl;

@WebServlet("/valid")
public class LoginServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("Username");
		String pass = request.getParameter("Password");
		LoginModel model = new LoginModel(); 
		model.setusername(username);
		model.setsetpass(pass);
		LoginService logservice = new LoginServiceImpl();
		boolean b;
		b = logservice.isLoginSuccess(model);
		if(b)
		{
			out.println("<h4>Login Successfull</h4>");
		}
		else
		{
			out.println("<h4>Login Failed</h4>");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}