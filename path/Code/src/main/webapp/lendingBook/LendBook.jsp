<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>lendbook</title>
</head>
<body>

<a href="/LibraryProject/TopMenu.html?Top">トップメニュー</a>

	<h1 style="text-align:center">貸出</h1>

会員情報
 <table border="1" width="7%">
 	<tr><td align="center"> 会員ID</td><th></th></tr>
 	 <tr><td align="center"> 資料ID </td><th></th></tr>
 </table>
 
 貸し出す資料ID<br>
<form action="/LibraryProject/LeadConf" method="post">

<%
    for (int i = 0; i < 5; i++) {
%>
    	 <input type="text" name="lend" > <br>
<%
    }
%>

	<input type="submit" name="return" value="戻る"size="5">	
	<input type="button"  onclick="location.href='./LendConf.jsp'"name="lend" value="貸出" size="5">

 </form> 
 
 

</body>
</html>