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


@WebServlet("/delete")
public class DeleteAlumni extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("aid"));
		AlumniMasterModel am = new AlumniMasterModel();
		am.setAid(id);
		Alumnimasterservice amservice = new AlumniMasterServiceImpl();
		boolean b;
		b = amservice.isAlumnidelete(am);
		if(b)
		{
			out.println("<h4>Alumni Deleted Successfully</h4>");
			RequestDispatcher req = request.getRequestDispatcher("Viewalumni.jsp");
			req.forward(request, response);
		}
		else
		{
			out.println("<h4>Alumni Details not Deleted</h4>");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
