<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Uros - Login.jsp Title</title>
</head>
<body>
Hello and welcome to Uros's first JSP Webpage.
<form action="login.do" method="post">
Enter your login: 
<input type="text" name = "login"/>
Enter your password:
<input type="password" name = "pw"/>
<input type="submit" value="Submit"/>
</form>
<p><font color="red">${errorMessage}</font></p>

</body>
</html>