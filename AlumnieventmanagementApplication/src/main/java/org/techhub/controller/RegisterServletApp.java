package org.techhub.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.techhub.model.LoginModel;
import org.techhub.repository.DBParent;
import org.techhub.service.LoginService;
import org.techhub.service.LoginServiceImpl;
import org.techhub.service.RegisterService;
import org.techhub.service.RegisterServiceImpl;

@WebServlet("/register")
public class RegisterServletApp extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String path = request.getServletContext().getRealPath("/") + "resources\\db.properties";
		DBParent.path = path;
		out.println(path);
		LoginModel model = new LoginModel();
		RegisterService regservice = new RegisterServiceImpl();
		String username = request.getParameter("Username");
		String Password = request.getParameter("Password");
		String Contact = request.getParameter("Contact");
		String Email = request.getParameter("Email-Id");
		String logintype = request.getParameter("Logintype");
		model.setUsername(username);
		model.setPassword(Password);
		model.setEmail(Email);
		model.setContact(Contact);
		model.setLogintype(logintype);
		model = regservice.isaAlumniregister(model);
		if(model!=null)
		{
			out.println("<h4>Alumni Registration Success</h4>");
		}
		else
		{
			out.println("<h4>Some Problem is there</h4>");
		}
//		out.println(model);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
