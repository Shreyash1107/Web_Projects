<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.*, org.techhub.service.*, org.techhub.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Alumni</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet" href="CSS/delete.css" />

<script src="JS/delete.js"></script>
</head>
<body>
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-3">
				<div class="nav flex-column nav-pills menubar bg-light"
					id="v-pills-tab" role="tablist" aria-orientation="vertical">
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
						<div class="form-container mt-12">
							<h3>Delete Alumni</h3>
							<label>Do you want to Delete the Alumni details?</label> <select
								class="form-control bg-light text-dark mt-2" id="updateOption"
								onchange="toggleFields(this.value)">
								<option value="">Select</option>
								<option value="yes">Yes</option>
								<option value="no">No</option>
							</select>
							<form name='frm' id="frm" action='delete' method='GET'>
								<div id="updateFields" style="display: none;">
									<div class="form-group mt-3">
										<label for="aidSelect">Select Alumni ID</label> <select
											class="form-control" id="aidSelect" name="aid">
											<option value="">Select ID</option>
											<%
											Alumnimasterservice amservice = new AlumniMasterServiceImpl();
											Vector<AlumniMasterModel> v = amservice.getalumni();
											for (AlumniMasterModel amodel : v) {
											%>
											<option value="<%=amodel.getid()%>"><%=amodel.getid()%></option>
											<%
											}
											%>
										</select>
									</div>
									<div class="form-group d-flex justify-content-center">
										<input type='submit' name='s' id="btn" value='Delete Alumni'
											class="btn btn-primary" />
									</div>
								</div>
								<!-- updateFields -->
							</form>
						</div>
						<!-- form-container -->
					</div>
					<!-- tab-pane -->
					<div class="tab-pane fade" id="v-pills-profile" role="tabpanel"
						aria-labelledby="v-pills-profile-tab"></div>
					<div class="tab-pane fade" id="v-pills-messages" role="tabpanel"
						aria-labelledby="v-pills-messages-tab"></div>
					<div class="tab-pane fade" id="v-pills-settings" role="tabpanel"
						aria-labelledby="v-pills-settings-tab"></div>
				</div>
				<!-- tab-content -->
			</div>
			<!-- col-md-9 -->
		</div>
		<!-- row -->
	</div>
	<!-- container -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>