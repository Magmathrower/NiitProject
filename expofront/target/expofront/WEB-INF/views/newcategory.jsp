<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
	<title>Category Data</title>
</head>
<body>
	<form action="/InsertCategory" method="post">
		
		<table align="center">
		<tr>
			<td colspan="2"> Category Info</td>
		</tr>
		<tr>
			<td>Category Name</td>
			<td><input type="text" name="catName"></td>
		</tr>
		<tr>
			<td>Category Description</td>
			<td><input type="text" name="catDesc"></td>
		</tr>
		<tr>
			<td colspan="2"><br>
                 <input type="submit" value=" Save Values">
			</td>
		</tr>
	</table>

	</form>
	

</body>
</html>
