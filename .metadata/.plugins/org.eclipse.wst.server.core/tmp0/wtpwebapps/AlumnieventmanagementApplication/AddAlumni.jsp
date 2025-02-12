<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding Alumni</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	<link rel="stylesheet" href="CSS/Addalumni.css"/>
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
							<h3 class="text-center">Add New Alumni</h3>
							<form name='frm' id="frm" action='alumni' method='POST'
								onsubmit="validateName()">
								<div class="form-group">
									<label for="txtBatch">Alumni Name</label> <input type="text"
										name="alumniName" id="txtBatch" class="form-control"
										placeholder="Enter Alumni Name" onkeyup="validateBatch()"
										autocomplete="off"> <span id="s"></span>
								</div>
								<div class="form-group">
									<label for="txtBatch">Alumni Email</label> <input type="email"
										name="Email" id="txtBatch" class="form-control"
										placeholder="Enter Alumni Email-Id" onkeyup="validateBatch()"
										autocomplete="off"> <span id="s"></span>
								</div>
								<div class="form-group">
									<label for="txtBatch">Alumni Contact</label> <input
										type="contact" name="Contact" id="txtBatch"
										class="form-control" placeholder="Enter Alumni Contact"
										onkeyup="validateBatch()" autocomplete="off"> <span
										id="s"></span>
								</div>
								<div class="form-group">
									<label for="txtBatch">Alumni Age</label> <input type="number"
										name="Age" id="txtBatch" class="form-control"
										placeholder="Enter Alumni Age" onkeyup="validateBatch()"
										autocomplete="off"> <span id="s"></span>
								</div>
								<div class="form-group">
									<label for="txtBatch">Alumni Company Name</label> <input
										type="text" name="compname" id="txtBatch" class="form-control"
										placeholder="Enter Alumni Company Name"
										onkeyup="validateBatch()" autocomplete="off"> <span
										id="s"></span>
								</div>
								<div class="form-group">
									<label for="txtBatch">Batch Id</label> <input type="number"
										name="batch" id="txtBatch" class="form-control"
										placeholder="Enter Alumni batch ID" onkeyup="validateBatch()"
										autocomplete="off"> <span id="s"></span>
								</div>
								<div class="form-group d-flex justify-content-center">
									<input type='submit' name='s' id="btn" value='Add New Alumni'
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