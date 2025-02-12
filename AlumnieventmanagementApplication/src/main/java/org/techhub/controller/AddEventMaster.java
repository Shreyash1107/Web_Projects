package org.techhub.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.techhub.model.EventMasterModel;
import org.techhub.service.EventMasterServiceImpl;
import org.techhub.service.EventMasterservice;

@WebServlet("/AddEventMaster")
public class AddEventMaster extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("evname");
		String date = request.getParameter("dt");
		String time = request.getParameter("period");
		String Venue = request.getParameter("venue");
		int bid = Integer.parseInt(request.getParameter("bid"));
		String subject = request.getParameter("sub");
		EventMasterModel emodel = new EventMasterModel();
		emodel.setname(name);
		emodel.setdate(date);
		emodel.settime(time);
		emodel.setvenue(Venue);
		emodel.setid(bid);
		emodel.setsubject(subject);
		EventMasterservice emservice = new EventMasterServiceImpl();
		boolean b;
		b = emservice.isEventAdded(emodel);
		if(b)
		{
			out.println("<h4>Events Added SUccessfully<h4>");
		}
		else
		{
			out.println("<h4>Events Not Added Successfully</h4>");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		doGet(request, response);
	}
}
