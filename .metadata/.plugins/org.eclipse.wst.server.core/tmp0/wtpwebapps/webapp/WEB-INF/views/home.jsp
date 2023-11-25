<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body style="font-size: 25px;">
	<form style="text-align: center" name="frm" action="save" method="GET">
		<h2>
			<u>Registration Form</u>
		</h2>
		<input type="text" name="name" value="" style="font-size: 25px; width: 400px; height: 40px;"placeholder="Enter Your Name " required /><br> <br> 
		<input type="email" name="email" value="" style="font-size: 25px; width: 400px; height: 40px;" placeholder="Enter  Email-Id" required /><br> <br> 
		<input type="text" name="username" value="" style="font-size: 25px; width: 400px; height: 40px;" placeholder="Enter Username "  required/><br> <br> 
		<input type="password" name="password" value="" style="font-size: 25px; width: 400px; height: 40px;" placeholder="Enter Password "  required/><br> <br> 
		<input type="number" name="contact" value="" style="font-size: 25px; width: 400px; height: 40px;" placeholder="Enter Contact Number "  required/><br> <br>
	    <input type="file" name="file" value=""  style="font-size: 25px; width: 400px; height: 40px;" /><br> <br> 
	    <input type="submit" value="Register Here" style="height: 40px; width: 400px; font-size:25px"  />
	</form>
</body>
</html>
