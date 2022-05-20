<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LeadConf</title>

<style>
	div { text-align : center ; }
</style>
</head>
<body>

<a href="/LibraryProject/TopMenu.html?Top">トップメニュー</a>

	<h1 style="text-align:center">貸出</h1>

会員情報
 <table border="1" width="7%">
 	 <tr><td align="center"> 会員ID</td><th></th></tr>
 	 <tr><td align="center"> 資料ID </td><th></th></tr>
 </table>
 
 貸し出す資料ID
 
	<table border="1" width="50%">
 		<tr><th>資料ID</th><th>ISBN番号</th><th>資料名</th><th>貸出年月日</th><th>返却期日</th></tr>
 		<tr><td></td><td></td><td></td><td></td><td></td></tr>
 		<tr><td></td><td></td><td></td><td></td><td></td></tr>
 		<tr><td></td><td></td><td></td><td></td><td></td></tr>
 		<tr><td></td><td></td><td></td><td></td><td></td></tr>
    </table>
 

 <form action="/LibraryProject/LeadComp" method="post">
 <div>
	<input type="submit"  display="inline-block"  name="return" value="戻る"  size="5">
	<input type="submit" display="inline-block" name="return" value="貸出"  size="5">
	</div>
 </form>
 

</body>
</html>