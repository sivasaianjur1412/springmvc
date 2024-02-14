<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Home Page</title>
</head>
<body align="center">
<h3>Hi ${userName}</h3>
    <form action="${pageContext.request.contextPath}/user/bmi" method="post">
        <label>Height: </label>
        <input type="number" name="height"><br><br>

        <label>Weight: </label>
        <input type="number" name="weight"></br><br>

        <input type="submit" value="Get BMI">
    </form>
    <h4>Your BMI is: ${bmiCalculator}</h4>
    <h4 style="color:red;">${errorMessage}</h4>
</body>
</html>