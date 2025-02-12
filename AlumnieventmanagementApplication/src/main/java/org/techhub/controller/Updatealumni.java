package org.techhub.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.techhub.model.AlumniMasterModel;
import org.techhub.service.AlumniMasterServiceImpl;
import org.techhub.service.Alumnimasterservice;

@WebServlet("/update")
public class Updatealumni extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("aid"));
		String name = request.getParameter("alumniName");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		int Age = Integer.parseInt(request.getParameter("age"));
		String Company = request.getParameter("compname");
		int bid = Integer.parseInt(request.getParameter("bid"));
		AlumniMasterModel amodel = new AlumniMasterModel();
		amodel.setAid(id);
		amodel.setname(name);
		amodel.setEmail(email);
		amodel.setContact(contact);
		amodel.setAge(Age);
		amodel.setCompany(Company);
		amodel.setBid(bid);
		Alumnimasterservice amservice = new AlumniMasterServiceImpl();
		boolean b;
		b = amservice.isAlumniUpdated(amodel);
		if(b)
		{
			out.println("<h4>Alumni Updated Successfully</h4>");
			RequestDispatcher req = request.getRequestDispatcher("Viewalumni.jsp");
			req.forward(request, response);
		}
		else
		{
			out.println("<h4>Alumni Not Updated Successfully</h4>");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}