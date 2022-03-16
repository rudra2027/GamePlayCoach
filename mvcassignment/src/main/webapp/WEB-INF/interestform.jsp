<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>

<title>Simple interest</title>
</head>
<body>

<form:errors path="student1.*"/>
<form action="/mvcassignment/intout" method="post">
<table>
<td>Please input  the principal amount:<input type="number" name="principal" placeholder="Amount"></td>

<td>Please input  the rate of interest:<input type="number" name="rate" placeholder="rate"></td>


<td>Please input  the time of interest:<input type="number" name="time" placeholder="Time"></td>


<td><input type="submit" value="Submit"/></td>

</table>
</form>
</body>
</html>