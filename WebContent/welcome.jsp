<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/pure-min.css" 
integrity="sha384-nn4HPE8lTHyVtfCBi5yW9d20FjT8BJwUXyWZT9InLYax14RDjBj46LmSztkmNP9w" crossorigin="anonymous">
<title>Welcome</title>
</head>
<body>
	<div style="width:400px; height:100px; margin:5px auto;">
	<h3>书籍查询</h3>
    <form action="queryBookByName" method="post" class="pure-form pure-form-stacked">
        作者姓名 <input type="text" name="authorName" />
        <button type="submit" class="pure-button pure-button-primary">查询</button>
    </form>
    <br/>
    <h3>添加书籍</h3>
    <form action="queryAuthor" method="post" class="pure-form pure-form-stacked">
        作者姓名 <input type="text" name="authorName" />
        <button type="submit" class="pure-button pure-button-primary">下一步</button>
    </form>
    </div>
</body>
</html>