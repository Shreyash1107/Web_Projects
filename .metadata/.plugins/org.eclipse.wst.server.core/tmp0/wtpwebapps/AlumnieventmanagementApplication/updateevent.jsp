<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, org.techhub.service.*, org.techhub.model.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Update Alumni</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="CSS/update.css">
    <script src="JS/updateevent.js"></script>
    <script>
        function toggleFields(option) {
            var updateFields = document.getElementById("updateFields");
            if (option === "yes") {
                updateFields.style.display = "block";
            } else {
                updateFields.style.display = "none";
            }
        }

        function initializePage() {
            document.getElementById("updateOption").value = "";
            document.getElementById("updateFields").style.display = "none";
        }

        window.onload = initializePage;
    </script>
</head>
<body>
    <div class="container mt-5">
        <div class="row">
            <div class="col-md-3">
                <div class="nav flex-column nav-pills menubar bg-light" id="v-pills-tab" role="tablist" aria-orientation="vertical">
                    <a class="nav-link" href="index.jsp">Batch Master</a>
                    <a class="nav-link" href="Alumnimaster.jsp">Alumni Master</a>
                    <a class="nav-link" href="EventMaster.jsp">Event Master</a>
                    <a class="nav-link" href="#v-pills-attendance">Attendance Master</a>
                    <a class="nav-link" href="#v-pills-feedback">Feedback Master</a>
                </div>
            </div>
            <div class="col-md-9 content">
                <div class="tab-content" id="v-pills-tabContent">
                    <div class="tab-pane fade show active" id="v-pills-home" role="tabpanel" aria-labelledby="v-pills-home-tab">
                        <div class="form-container mt-12">
                            <h3>Update Event</h3>
                            <label>Do you want to update the Event details?</label>
                            <select class="form-control bg-light text-dark mt-2" id="updateOption" onchange="toggleFields(this.value)">
                                <option value="">Select</option>
                                <option value="yes">Yes</option>
                                <option value="no">No</option>
                            </select>
                            <form name='frm' id="frm" action='update' method='GET'>
                                <div id="updateFields" style="display: none;">
                                    <div class="form-group mt-3">
                                        <label for="aidSelect">Select Event ID</label>
                                        <select class="form-control" id="aidSelect" name="eid">
                                            <option value="">Select ID</option>
                                            <%
                                                EventMasterservice evservice = new EventMasterServiceImpl();
                                                Vector<EventMasterModel> v  = evservice.getevents();
                                                for (EventMasterModel emodel : v) {
                                            %>
                                            <option value="<%=emodel.geteid()%>"><%=emodel.geteid() %></option>
                                            <%
                                                }
                                            %>
                                        </select>
                                    </div>
                                    <div class="form-group mt-3">
                                        <label for="txtAlumniName">Updated Event Name</label>
                                        <input type="text" name="eventname" id="txtAlumniName" class="form-control" placeholder="Enter Event Name" autocomplete="off">
                                    </div>
                                    <div class="form-group">
                                        <label for="txtEmail">Updated Event Date</label>
                                        <input type="date" name="dt" id="txtEmail" class="form-control" placeholder="Date" autocomplete="off">
                                    </div>
                                    <div class="form-group">
                                        <label for="txtContact">Updated Time</label>
                                        <input type="time" name="period" id="txtContact" class="form-control" autocomplete="off">
                                    </div>
                                    <div class="form-group">
                                        <label for="txtAge">Updated Venue</label>
                                        <input type="text" name="venue" id="txtAge" class="form-control" placeholder="Venue" autocomplete="off">
                                    </div>
                                    <div class="form-group">
                                        <label for="txtCompName">Updated Subject</label>
                                        <input type="text" name="sub" id="txtCompName" class="form-control" placeholder="Subject" autocomplete="off">
                                    </div>
                                    <div class="form-group mt-3">
                                        <label for="batchSelect">Updated Batch ID</label>
                                        <select class="form-control" id="batchSelect" name="bid">
                                            <option value="">Select ID</option>
                                            <%
                                                BatchMasterService bmservice = new BatchMasterServiceImpl();
                                                Vector<BatchMasterModel> v1 = bmservice.getbtchdetails();
                                                for (BatchMasterModel bm : v1) {
                                            %>
                                            <option value="<%=bm.getBid()%>"><%=bm.getBid()%></option>
                                            <%
                                                }
                                            %>
                                        </select>
                                    </div>
                                    <div class="form-group d-flex justify-content-center">
                                        <input type='submit' name='s' id="btn" value='Update Event' class="btn btn-primary" />
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>