package org.techhub.controller;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.techhub.model.LoginModel;
import org.techhub.service.ValidateUserserviceImpl;
import org.techhub.service.Validateuserservice;

@WebServlet("/valid")
public class ValidateServletController extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		String username = request.getParameter("Username");
		String password = request.getParameter("Password");
		LoginModel lmodel = new LoginModel();
		lmodel.setUsername(username);
		lmodel.setPass(password);
		Validateuserservice validservice = new ValidateUserserviceImpl();
		lmodel = validservice.isValidate(lmodel);
		PrintWriter out = response.getWriter();
		out.println(lmodel);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
