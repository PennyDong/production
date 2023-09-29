<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="addmemberController" method="post">
		<table align="center" border=1 width=500>
			<td>
				<table align="center" width=400>
					<tr align="center">
						<td colspan=2>會員註冊系統</td>
					</tr>
					<tr align="center">
						<td><h5>Your name</h5></td>
						<td><input type="text" name=name ></td>
					</tr>
					<tr align="center">
						<td><h5>Username</h5></td>
						<td><input type="text" name=username ></td>
					</tr>
					<tr align="center">
						<td><h5>Password</h5></td>
						<td><input type="password" name=password ></td>
					</tr>
					<tr align="center">
						<td colspan=2><input type="submit" value="ok"></td>
					</tr>
				</table>	
			
			
			
		</table>
	
	</form>
</body>
</html>