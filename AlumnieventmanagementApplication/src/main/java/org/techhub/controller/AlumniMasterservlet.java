package org.techhub.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.techhub.model.AlumniMasterModel;
import org.techhub.service.AlumniMasterServiceImpl;
import org.techhub.service.Alumnimasterservice;

@WebServlet("/alumni")
public class AlumniMasterservlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		AlumniMasterModel amodel = new AlumniMasterModel();
		String name = request.getParameter("alumniName");
		String email= request.getParameter("Email");
		String Contact = request.getParameter("Contact");
		int Age = Integer.parseInt(request.getParameter("Age"));
		String company = request.getParameter("compname");
		int Bid = Integer.parseInt(request.getParameter("batch"));
		amodel.setname(name);
		amodel.setEmail(email);
		amodel.setContact(Contact);
		amodel.setCompany(company);
		amodel.setAge(Age);
		amodel.setBid(Bid);
		Alumnimasterservice amservice = new AlumniMasterServiceImpl();
		boolean b;
		b = amservice.isAlumniAdded(amodel);
		if(b)
		{
			out.println("<h4>Alumni Details Successfully Added</h4>");
		}
		else
		{
			out.println("<h4>Alumni Details Not Added</h4>");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}