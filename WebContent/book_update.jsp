<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/pure-min.css" 
integrity="sha384-nn4HPE8lTHyVtfCBi5yW9d20FjT8BJwUXyWZT9InLYax14RDjBj46LmSztkmNP9w" crossorigin="anonymous">
<title>book update</title>
</head>
<body>
	<div style="width:400px; height:100px; margin:5px auto;">
	<h3>更新书籍信息</h3>
    <form action="updateBook" method="post" class="pure-form pure-form-aligned">
    	<s:hidden name = "isbn" value = "%{isbn}" />
    	<s:hidden name = "title" value = "%{title}" />
    	<div class="pure-control-group">
        作者姓名 <input type="text" name="authorName" />
        </div>
        <div class="pure-control-group">
        出版社 <input type="text" name="publisher" />
        </div>
        <div class="pure-control-group">
        出版日期 <input type="text" name="publishDate"/>
        </div>
        <div class="pure-control-group">
        价格 <input type="text" name="price" />
        </div>
        <button type="submit" class="pure-button pure-button-primary">更新</button>
    </form>
    </div>
</body>
</html>