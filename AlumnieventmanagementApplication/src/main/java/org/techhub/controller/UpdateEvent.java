package org.techhub.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.techhub.model.EventMasterModel;
import org.techhub.service.EventMasterServiceImpl;
import org.techhub.service.EventMasterservice;

@WebServlet("/UpdateEvent")
public class UpdateEvent extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int eid = Integer.parseInt(request.getParameter("eid"));
		String name = request.getParameter("eventname");
		String date = request.getParameter("dt");
		String time = request.getParameter("period");
		String Venue = request.getParameter("venue");
		int bid = Integer.parseInt(request.getParameter("bid"));
		String subject = request.getParameter("sub");
		EventMasterModel em = new EventMasterModel();
		em.seteid(eid);
		em.setname(name);
		em.setdate(date);
		em.settime(time);
		em.setvenue(Venue);
		em.setid(bid);
		em.setsubject(subject);
		EventMasterservice emservice = new EventMasterServiceImpl();
		boolean b; 
		b = emservice.isEventupdate(em);
		if(b)
		{
			RequestDispatcher reqdispatch = request.getRequestDispatcher("Viewevents.jsp");
			reqdispatch.forward(request, response);
		}
		else
		{
			out.println("<h4>Details Not Updated</h4>");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}