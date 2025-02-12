package org.techhub.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.techhub.model.LoginModel;
import org.techhub.repository.DBParent;
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
		model.setUsername(username);
		model.setPassword(pass);
		LoginService logservice = new LoginServiceImpl();
		model = logservice.isLoginSuccess(model);
		out.println(model.getUsername() + " " + model.getPassword() + " " + model.getLogintype());
		if(model.getLogintype().equals("Student"))
		{
			out.println("<h4>Student Login Successfull</h4>");
			HttpSession session = request.getSession(true);
			session.setAttribute("username", model.getUsername());
			session.setAttribute("pass", model.getPassword());
			RequestDispatcher reqdispatch = request.getRequestDispatcher("index.jsp");
			reqdispatch.forward(request, response);
		}
		else if(model.getLogintype().equals("Admin"))
		{
			out.println("<h4>Admin Login Successfull</h4>");
		}
		else
		{
			out.println("<h4>Invalid Username and password</h4>");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}