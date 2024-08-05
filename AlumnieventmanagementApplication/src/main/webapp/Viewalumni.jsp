<%@page import="org.techhub.service.*"%>
<%@page import="org.techhub.model.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Alumni</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	<link rel="stylesheet" href="CSS/view.css"/>
</head>
<body>
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-3">
				<div class="nav flex-column nav-pills menubar bg-light" id="v-pills-tab"
					role="tablist" aria-orientation="vertical">
					<a class="nav-link" href="index.jsp">Batch Master</a>
					 <a class="nav-link" href="Alumnimaster.jsp">Alumni Master</a> 
					 <a class="nav-link" href="EventMaster.jsp">Event Master</a> 
					 <a class="nav-link" href="#v-pills-attendance">Attendance Master</a> 
					 <a class="nav-link" href="#v-pills-feedback">Feedback Master</a>
				</div>
			</div>
			<div class="col-md-9 content">
				<div class="tab-content" id="v-pills-tabContent">
					<div class="tab-pane fade show active" id="v-pills-home"
						role="tabpanel" aria-labelledby="v-pills-home-tab">
						<div class="form-container mt-5">
						<center>
							<h3 class="heading">
								Alumni Details	
							</h3>
						</center>
							<table class="table table-striped table-dark">
								<thead>
									<tr>
										<th scope="col">Aid</th>
										<th scope="col">Name</th>
										<th scope="col">Email</th>
										<th scope="col">Contact</th>
										<th scope="col">Age</th>
										<th scope="col">Company</th>
										<th scope="col">Bid</th>
									</tr>
								</thead>
								<tbody>
									<%
									Alumnimasterservice amservice = new AlumniMasterServiceImpl();
									Vector<AlumniMasterModel> vect = amservice.getalumni();
									if (vect != null) {
										for (AlumniMasterModel amodel : vect) {
									%>
									<tr>
										<td><%=amodel.getid()%></td>
										<td><%=amodel.getname()%></td>
										<td><%=amodel.getEmail()%></td>
										<td><%=amodel.getContact()%></td>
										<td><%=amodel.getAge()%></td>
										<td><%=amodel.getCompany()%></td>
										<td><%=amodel.getBid()%></td>
									</tr>
									<%
									}
									}
									%>
								</tbody>
							</table>
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
