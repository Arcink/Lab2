<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/pure-min.css" 
integrity="sha384-nn4HPE8lTHyVtfCBi5yW9d20FjT8BJwUXyWZT9InLYax14RDjBj46LmSztkmNP9w" crossorigin="anonymous">
<title>show detail</title>
</head>
<body >
	<div style="width:500px; height:100px; margin:5px auto;">
	<h3>书籍信息</h3>
	<table class="pure-table">
	<tr>
	<th>ISBN</th>
	<th>Title</th>
	<th>AuthorID</th>
	<th>Publisher</th>
	<th>PublishDate</th>
	<th>Price</th>
	</tr>
	<tr>
	<td><s:property value = "book.isbn" /></td>
	<td><s:property value = "book.title" /></td>
	<td><s:property value = "book.authorID" /></td>
	<td><s:property value = "book.publisher" /></td>
	<td><s:property value = "book.publishDate" /></td>
	<td><s:property value = "book.price" /></td>
	</tr>
    </table>
	<br/>
    <h3>作者信息</h3>
    <table class="pure-table">
	<tr>
	<th>AuthorID</th>
	<th>Name</th>
	<th>Age</th>
	<th>Country</th>
	</tr>
	<tr>
	<td><s:property value = "author.authorID" /></td>
	<td><s:property value = "author.name" /></td>
	<td><s:property value = "author.age" /></td>
	<td><s:property value = "author.country" /></td>
	</tr>
	</table>
	<br/>
	<form action="backHome" method="post">
        <button type="submit" class="pure-button pure-button-primary">回到首页</button>
    </form>
	<br/>
	<form action="updateRequirement" method="post">
       	<s:hidden name = "isbn" value = "%{book.isbn}" />
		<s:hidden name = "title" value = "%{book.title}" />
		<s:hidden name = "authorID" value = "%{book.authorID}" />
		<s:hidden name = "authorName" value = "%{author.name}" />
		<s:hidden name = "publisher" value = "%{book.publisher}" />
		<s:hidden name = "publishDate" value = "%{book.publishDate}" />
        <s:hidden name = "price" value = "%{book.price}" />
        <button type="submit" class="pure-button pure-button-primary">更新信息</button>
    </form>
    <br/>
	<form action="deleteBook" method="post">
       	<s:hidden name = "isbn" value = "%{book.isbn}" />
        <button type="submit" class="pure-button pure-button-primary">删除这本书</button>
    </form>
	</div>
</body>
</html>