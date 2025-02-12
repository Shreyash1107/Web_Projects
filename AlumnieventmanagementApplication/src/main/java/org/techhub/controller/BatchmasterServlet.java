package org.techhub.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.techhub.model.BatchMasterModel;
import org.techhub.service.BatchMasterService;
import org.techhub.service.BatchMasterServiceImpl;

@WebServlet("/batch")
public class BatchmasterServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		BatchMasterModel bmodel = new BatchMasterModel();
		String batchname = request.getParameter("batchName");
		bmodel.setname(batchname);
		boolean b;
		BatchMasterService bmservice = new BatchMasterServiceImpl();
		b = bmservice.isBatchAdded(bmodel);
		if(b)
		{
			out.println("<h4>Alumni Batch Successfully Added</h4>");
		}
		else
		{
			out.println("<h4>Alumni Batch has not been Added</h4>");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
