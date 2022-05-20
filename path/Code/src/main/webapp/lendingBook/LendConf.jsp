<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LendConf</title>

<style>
	div { text-align : center ; }
</style>
</head>
<body>

<a href="/LibraryProject/TopMenu.html?Top">トップメニュー</a>

		<div><h1>貸出</h1></div>
	
	
	<font size="4" face="ＭＳ Ｐ明朝,ＭＳ 明朝">	
		<div>会員情報</div>
	</font>
	
 <table border="1" width="7%" align="center">
 <div>
 	 <tr><td  bgcolor="#f0e68c"> 会員ID</td><th></th></tr>
 	 <tr><td  bgcolor="#f0e68c"> 資料ID </td><th></th></tr>
 </div>
 </table>
 
 <br>
 <br>
 
   <font size="4" face="ＭＳ Ｐ明朝,ＭＳ 明朝">
		<div> 貸し出す資料ID</div>
 </font>

	<table border="1" width="50%" align="center">
 		<tr bgcolor="#ffe4c4"><th>資料ID</th><th>ISBN番号</th><th>資料名</th><th>貸出年月日</th><th>返却期日</th></tr>
 		<tr><td></td><td></td><td></td><td></td><td></td></tr>
 		<tr><td></td><td></td><td></td><td></td><td></td></tr>
 		<tr><td></td><td></td><td></td><td></td><td></td></tr>
 		<tr><td></td><td></td><td></td><td></td><td></td></tr>
    </table>

<br>
<br>

 <form action="/LibraryProject/LeadComp" method="post">
 <div>
	<input type="button"  onclick="location.href='./LendBook.jsp'"  display="inline-block"  name="return" value="戻る"  size="5">
	<input type="button"  onclick="location.href='./LendComp.jsp'"  display="inline-block" name="return" value="貸出"  size="5">
	</div>
 </form>
 

</body>
</html>