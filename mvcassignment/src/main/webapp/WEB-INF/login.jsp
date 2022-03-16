<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
<title>Login form</title>
</head>
<body>
<form:errors path="user1.*"/>
<form action="/mvcassignment/Success" method="post">
<table>
<tr>
<td>
Enter Name :<input type="text" name="name" placeholder="Enter Name">
</td>

</tr>
<tr>
<td>
Enter Email :<input type="email" name="email" placeholder="Enter Mail">
</td>

</tr>
<tr>
<td>
Enter Password :<input type="password" name="password" value="********">
</td>
<input type="submit" value="Submit">
</tr>

</table>
</form>
</body>
</html>