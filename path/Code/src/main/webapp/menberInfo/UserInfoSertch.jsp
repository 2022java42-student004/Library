<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>会員検索</title>
		<link href="/css/TopLogin.css" rel="stylesheet">
	</head>
	<body>
		<h2 class="s_center">会員情報</h2>
		<form action="../SerchInfoUser" method="post">
			e-Mail : <input type="text" name="menberMail">
			<input type="hidden" name="rePage" value="menberInfo/UserInfoSertch.jsp">
			<input type="submit" value="検索">
		</form>
		
		<table border="1">
			<tr><td>会員ID</td><td>氏名</td><td>生年月日</td><td>入会年月日</td><td>退会年月日</td><td>最終情報更新日時</td></tr>
			<tr><td>${menberInfo.iID}</td><td>${menberInfo.strName}</td><td>${menberInfo.birthday}</td><td>${menberInfo.join_date}</td><td>${menberInfo.secode_date}</td><td>${menberInfo.update_date}</td></tr>
		</table>
		
	</body>
</html>