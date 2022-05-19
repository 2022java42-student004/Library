<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ログイン画面</title>
		<style>
			.s_center{text-align: center}
			.s_id{
				text-align: center;
				text-indent : 62px;
				}
			.s_err{
				text-align: center;
				width : 500px;
				hight : 14px;
				padding : 20px;
				border : 2px red solid;
				background-color : red;
				margin: auto;
			}
		</style>
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