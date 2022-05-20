<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>StockSearch</title>
<link href="css/StockSearch.css" rel="stylesheet">
</head>
<body>

<div class="leftmargin">
	 <a href="../../TopMenu.html" >トップメニュー</a>
    </div>


<div class="centermargin">
    <h1 style="text-align:center">資料検索</h1>
    </div>

<br>

<form action="????" method="post" align="center">
 資料ID
  <input type="search" name="search" placeholder="資料IDを入力">
  <input type="submit" name="submit" value="検索">
</form>

<br>

<table border="1" align="center">
     
     
     <tr><td align="center"  bgcolor="#CCCCFF"> 資料ID</td><th></th>
     <tr><td align="center"  bgcolor="#CCCCFF"> ISBN番号</td><th></th></tr>
     <tr><td align="center"  bgcolor="#CCCCFF"> 分類コード</td><th></th></tr>
     <tr><td align="center"  bgcolor="#CCCCFF"> 資料名</td><th></th></tr>
     <tr><td align="center"  bgcolor="#CCCCFF"> 著者名</td><th></th></tr>
     <tr><td align="center"  bgcolor="#CCCCFF"> 出版社</td><th></th></tr>
     <tr><td align="center"  bgcolor="#CCCCFF"> 出版日</td><th></th></tr>
     <tr><td align="center"  bgcolor="#CCCCFF"> 入荷年月日</td><th></th></tr>
     <tr><td align="center"  bgcolor="#CCCCFF"> 出荷年月日</td><th></th></tr>
     <tr><td align="center"  bgcolor="#CCCCFF"> 備考</td><th></th></tr>
 
</table>

<br>

<table border="1" align="center">
<tr><td align="center"  bgcolor="#D9E5FF">同じ資料の在庫</td><th></th>
</table>

<br>


<input type="button" onclick="location.href='../StockMenu.html'" name="return" value="資料管理メニューへ戻る">	



</body>
</html>