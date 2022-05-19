<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
		</style>
	</head>
	<body>
		<form action="TopLoginServlt" method="post">
			<p class="s_id">ID : <input type="text" name="id"><br></p>
			<p class="s_center">パスワード：<input type="password" name="pass"><br></p>
			<p class="s_center"><input type="submit" value="ログイン">
		</form>
	</body>
</html>