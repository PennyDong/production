<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="memberPasswordController" method="post">
		<table align="center" width=500 height=600 border=1>
			<tr align="center" font-size=30px>
				<td>修改個人檔案</td>
			</tr>
			<tr>
				<td>
					<table align="center">
					<tr>
						<td><h5>Your old password</h5></td>
						<td><input type="text" name="password">
					</tr>
					<tr>
						<td><h5>Your new password</h5></td>
						<td><input type="text" name="newPassword"></td>
					<tr>
					</table>
				</td>
			</tr>
			<tr>
				<td colspan=2 align="center">
					<input type="submit" value="確定">
					<button><a href="porder.jsp">回上一頁</button>
				</td>
			</tr>		
		</table>
	</form>
</body>
</html>