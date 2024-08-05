<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import = "org.techhub.model.*" %>
    <%@page import = "org.techhub.service.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
    href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
    crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
    integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
    crossorigin="anonymous"></script>
<script
    src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"
    integrity="sha384-csM6+TgZbKGzJlA8gF08m5pXvGFsKCt2tb6x5tnuI8eAIDfLA/VJl9LkJLC1U+pA"
    crossorigin="anonymous"></script>
<script
    src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
    integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
    crossorigin="anonymous"></script>
    <link rel="stylesheet" type="text/css" href="CSS/ViewEvent.css">
</head>
<body>
		<div class="container mt-5">
			<div class="row">
				<div class="col-md-3">
				<div class="nav flex-column nav-pills menubar" id="v-pills-tab"
					role="tablist" aria-orientation="vertical">
					<a class="nav-link" href="index.jsp">Batch Master</a>
					 <a class="nav-link" href="Alumnimaster.jsp">Alumni Master</a> 
					 <a class="nav-link" href="#v-pills-messages">Event Master</a> 
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
								Event Details	
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
									EventMasterservice evservice = new EventMasterServiceImpl();
									Vector<EventMasterModel> vect = evservice.getevents();
									if(vect!=null)
									{
										for(EventMasterModel emodel : vect)
										{
									%>
									<tr>
									<td><%=emodel.geteid() %></td>
									<td><%=emodel.getname() %></td>
									<td><%=emodel.getdate() %></td>
									<td><%=emodel.gttime() %></td>
									<td><%=emodel.getvenue() %></td>
									<td><%=emodel.getbid() %></td>
									<td><%=emodel.getsubject() %></td>
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