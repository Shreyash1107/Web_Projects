<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Event Master Module</title>
<link rel="stylesheet"
    href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
    crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="styles.css">
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
<link rel="stylesheet" href="CSS/Alumni.css"/>
</head>
<body>
    <div class="container mt-5">
        <div class="row">
            <div class="col-md-3">
                <div class="nav flex-column nav-pills menubar bg-light" id="v-pills-tab"
                    role="tablist" aria-orientation="vertical">
                    <a class="nav-link" href="index.jsp">Batch Master</a>
                    <a class="nav-link" href="Alumnimaster.jsp">Alumni Master</a>
                    <a class="nav-link" href="Eventmaster.jsp">Event Master</a>
                    <a class="nav-link" href="#v-pills-attendance">Attendance Master</a>
                    <a class="nav-link" href="#v-pills-feedback">Feedback Master</a>
                </div>
            </div>
            <div class="col-md-9 content">
                <div class="form-container mt-5">
                    <div class="form-group d-flex justify-content-center link-group">
                        <a href="AddEvents.jsp" class="btn btn-secondary m-2">Add Event</a>
                        <a href="Viewevents.jsp" class="btn btn-warning m-2">View Event</a>
                        <a href="updateevent.jsp" class="btn btn-info m-2">Update Event</a>
                        <a href="#" class="btn btn-danger m-2">Delete Event</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
