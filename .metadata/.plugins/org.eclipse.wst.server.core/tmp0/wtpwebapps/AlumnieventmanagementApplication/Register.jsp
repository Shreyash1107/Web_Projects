<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel='stylesheet' href='CSS/register.css'/>
</head>
<body>
<form name='frm' action='register' method='POST'>
<center>
<div class='box'>
	<div class='container'>
		<h4>Alumni Registration Form</h4>
		<div class='wrapper'>
			<input type='text' name='Username' value='' 
				placeholder='Username' autocomplete='off' />
		</div>
		<div class='content'>
			<input type='password' name='Password' value=''
				placeholder='Password' autocomplete='off'/>
		</div>
		<div class='type'>
			<input type='text' name='Logintype' value='' 
				placeholder='Logintype' autocomplete='off' />
		</div>
		<div class='sub-content'>
			<input type='contact' name='Contact' value=''
				placeholder='Mobile Number' autocomplete='off'/>
		</div>
		<div class='menu'>
			<input type='email' name='Email-Id' value=''
					placeholder='Email-Id' autocomplete='off'/>
		</div>
		<div class='btn'>
			<input type='submit' name='reg' value='Register'/>
		</div>
	</div>
	</center>
	</div>
	</form>
</body>
</html>