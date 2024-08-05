<%@page import="org.techhub.service.BatchMasterServiceImpl"%>
<%@page import="org.techhub.service.BatchMasterService"%>
<%@page import="java.util.*" %>
<%@page import="org.techhub.model.BatchMasterModel" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding Events</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet" href="CSS/Addevent.css">
</head>
<body>
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-3">
				<div class="nav flex-column nav-pills menubar bg-light" id="v-pills-tab"
					role="tablist" aria-orientation="vertical">
					<a class="nav-link" href="index.jsp">Batch Master</a>
					 <a class="nav-link" href="Alumnimaster.jsp">Alumni Master</a> 
					 <a class="nav-link" href="#v-pills-messages">Event Master</a> 
					 <a class="nav-link" href="#v-pills-attendance">Attendance Master</a> 
					 <a class="nav-link" href="#v-pills-feedback">Feedback Master</a>
			</div>
			<div class="col-md-9 content">
				<div class="tab-content" id="v-pills-tabContent">
					<div class="tab-pane fade show active" id="v-pills-home"
						role="tabpanel" aria-labelledby="v-pills-home-tab">
						<div class="form-container mt-5">
							<h3 class="text-center">Add New Events</h3>
							<form name='frm' id="frm" action='AddEventMaster' method='POST'
								onsubmit="validateName()">
								<div class="form-group">
									<label for="txtBatch">Event Name</label> <input type="text"
										name="evname" id="txtBatch" class="form-control"
										placeholder="Enter Event Name" onkeyup="validateBatch()"
										autocomplete="off"> <span id="s"></span>
								</div>
								<div class="form-group">
									<label for="txtBatch">Date</label> <input type="date"
										name="dt" id="txtBatch" class="form-control"
										placeholder="Enter Event Date" onkeyup="validateBatch()"
										autocomplete="off"> <span id="s"></span>
								</div>
								<div class="form-group">
									<label for="txtBatch">Event Time</label> <input type="time"
										name="period" id="txtBatch" class="form-control"
										placeholder="Enter Event Time" onkeyup="validateBatch()"
										autocomplete="off"> <span id="s"></span>
								</div>
								<div class="form-group">
									<label for="txtBatch">Venue</label> <input type="text"
										name="venue" id="txtBatch" class="form-control"
										placeholder="Enter Event Venue" onkeyup="validateBatch()"
										autocomplete="off"> <span id="s"></span>
								</div>
								<div class="form-group">
									Batch Id
									<select
										class="form-control bg-light text-dark mt-2" id="batch"
										 name = "bid">
										<option value="">Select Bid</option>
										<%
										BatchMasterService bmservice = new BatchMasterServiceImpl();
										Vector<BatchMasterModel> vect = bmservice.getbtchdetails();
											for(BatchMasterModel bmodel : vect)
											{
											%>
											<option value="<%=bmodel.getBid()%>"><%=bmodel.getBid() %></option>
											<%
											}
											%>	
									</select>
								</div>
								<div class="form-group">
									<label for="txtBatch">Subject</label> <input type="text"
										name="sub" id="txtBatch" class="form-control"
										placeholder="Enter Event Subject " onkeyup="validateBatch()"
										autocomplete="off"> <span id="s"></span>
								</div>
								<div class="form-group d-flex justify-content-center">
									<input type='submit' name='s' id="btn" value='Add New Event'
										class="btn btn-primary" />
								</div>
							</form>
						</div>
					</div>
					<div class="tab-pane fade" id="v-pills-profile" role="tabpanel"
						aria-labelledby="v-pills-profile-tab"></div>
					<div class="tab-pane fade" id="v-pills-messages" role="tabpanel"
						aria-labelledby="v-pills-messages-tab"></div>
					<div class="tab-pane fade" id="v-pills-settings" role="tabpanel"
						aria-labelledby="v-pills-settings-tab"></div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>