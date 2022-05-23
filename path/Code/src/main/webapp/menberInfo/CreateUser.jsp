<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@
	page import="java.time.LocalDate"
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>新規会員登録</title>
	</head>
	<body>
		<h1>新規会員登録</h1>
		<form action="../CreateUserServlet" method="post">
			氏名<input type="text" name="name"><br>
			郵便番号<input type="number" name="post"><br>
			住所<input type="text" name="address"><br>
			E-mail<input type="text" name="mail"><br>
			生年月日<input type="date" name="birthday"><br>
			入会年月日<input type="date" name="indate" value=<%= LocalDate.now() %>>
			<input type="submit" value="戻る" formaction="../TopMenu.html"><input type="submit" value="追加" >
		</form>
	</body>