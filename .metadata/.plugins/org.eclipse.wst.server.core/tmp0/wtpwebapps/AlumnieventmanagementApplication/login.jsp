<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel='stylesheet' href='CSS/style.css'/>
</head>
<body>
	<center>
		<form name='frm' action='valid' method='GET'>
			<div class='wrapper'>
			<h4>Alumni Login</h4>
					<div class='box'>
						<input type='text' name='Username' value='' placeholder='Username'/></br></br>
						<input type='password' name='Password' value='' placeholder='Password(at lease 8-characters)'/></br></br>
						<input type='text' name='Logintype' value='' placeholder='Logintype'/></br></br>
						<input type='submit' name='sub' value='Login'/></br>
						<div class='Register'>
							<h4>If you don't have an Account</h4>
						</div>
						<div class='reference'>
							<a href='Register.jsp'>Click here</a>
						</div>
					</div>
			</div>
		</form>
	</center>
</body>
</html>