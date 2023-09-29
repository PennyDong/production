<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
		<form action="LoginController" method="post">
		<table align="center" method="post">
			<tr>
			<td colspna=2 align="center">
			<h3>登入你的個人空間</h3>
			</tr>
			<td>
				<table align="center" border=1>
					<tr align="center">
						<td>Username</td>
						<td><input type="text" name=username></td>
					</tr>
					<tr align="center">
						<td>Password</td>
						<td><input type="password" name=password></td>
					</tr>
					<tr>
						<td colspan=2 align="center">
							<input type="submit" value="ok">
							<input type="submit" value="Register">
						</td>
					</tr>
				</table>
			</td>
		</table>
		</form>
</body>
</html>