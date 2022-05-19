<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ログイン画面</title>
		<link href="css/TopLogin.css" rel="stylesheet">
	</head>
	<body>
	<c:if test="${not empty loginConf || loginConf == false}">
		<p class="s_err">IDかパスワードが違います</p>
	</c:if>
		<form action="TopLoginServlt" method="post">
			<p class="s_id">ID : <input type="text" name="id"><br></p>
			<p class="s_center">パスワード：<input type="password" name="pass"><br></p>
			<p class="s_center"><input type="submit" value="ログイン">
		</form>
	</body>
</html>