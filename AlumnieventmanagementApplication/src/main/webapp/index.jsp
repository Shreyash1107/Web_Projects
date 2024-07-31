<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet" href="CSS/home.css"/>
</head>
<body>
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-3">
				<div class="nav flex-column nav-pills menubar" id="v-pills-tab"
					role="tablist" aria-orientation="vertical">
					<a class="nav-link active" id="v-pills-home-tab" data-toggle="pill"
						href="index.jsp" role="tab" aria-controls="v-pills-home"
						aria-selected="true">Batch Master</a> <a class="nav-link"
						id="v-pills-profile-tab" data-toggle="pill"
						href="Alumnimaster.jsp" role="tab" aria-controls="v-pills-profile"
						aria-selected="false">Alumni Master</a> <a class="nav-link"
						id="v-pills-messages-tab" data-toggle="pill"
						href="#v-pills-messages" role="tab"
						aria-controls="v-pills-messages" aria-selected="false">Event
						Master</a> <a class="nav-link" id="v-pills-settings-tab"
						data-toggle="pill" href="#v-pills-settings" role="tab"
						aria-controls="v-pills-settings" aria-selected="false">Feedback
						Master</a>
				</div>
			</div>
			<div class="col-md-9 content">
				<div class="tab-content" id="v-pills-tabContent">
					<div class="tab-pane fade show active" id="v-pills-home"
						role="tabpanel" aria-labelledby="v-pills-home-tab">
						<div class="form-container mt-5">
							<h3 class="text-center">Add New Batch</h3>
							<form name='frm' id="frm" action='batch' method='POST'
								onsubmit="validateName()">
								<div class="form-group">
									<label for="txtBatch">Batch Name</label> <input type="text"
										name="batchName" id="txtBatch" class="form-control"
										placeholder="Enter Batch Name" onkeyup="validateBatch()"
										autocomplete="off"> <span id="s"></span>
								</div>
								<div class="form-group d-flex justify-content-center">
									<input type='submit' name='s' id="btn" value='Add New Batch'
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