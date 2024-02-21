<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>servlet wrapper demo</title>
</head>
<body>
<h1>servlet wrapper demo</h1>
<form action="servlet1" method='post'>
<label for="username"> Please enter your name </label>

<input type="text" id="username" name='username'>
<br>
<label for="city"> Please enter your city </label>
<input type="text" id="city" name='city'>

<button type='submit'>Submit</button>

</form>
</body>
</html>