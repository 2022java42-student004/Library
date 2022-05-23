<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ReturnScreen</title>
<link href="css/ReturnCompleted.css" rel="stylesheet">
</head>
<body>

	<a href="/LibraryProject/TopMenu.html" class="btn">トップメニュー</a>



	<form action="/LibraryProject/ReturnScreen.jsp" method="post">
		<div class="centermargin">
			<h1>貸出・返却</h1>
			
	
	E-mail  <input type="text"  name="name">
	
	<input type="submit" value="検索" formaction="../SerchInfoUser">
		
		
			<table border="1">
				<tr>
					<th>会員ID</th>
					<th width="300"></th>
				</tr>
				<tr>
					<th>氏名</th>
					<th width="300"></th>
				</tr>
			</table>





			<table border="1">
				<tr>
					<th width="50" height="50"></th>
					<th width="150">資料ID</th>
					<th width="150">ISBN番号</th>
					<th width="150">資料名</th>
					<th width="150">貸出年月日</th>
					<th width="150">返却期日</th>
				</tr>


				<tr>

					<th><input type="checkbox" name="return" value="1"></th>

					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
				</tr>


				<tr>
					<th><input type="checkbox" name="return" value="2"></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
				</tr>

				<tr>
					<th><input type="checkbox" name="return" value="3"></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
				</tr>

				<tr>
					<th><input type="checkbox" name="return" value="4"></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
				</tr>



			</table>

		

			<input type="submit" value="貸出" formaction="sample.php"> <input
				type="submit" value="返却">

		</div>
	</form>

</body>
</html>