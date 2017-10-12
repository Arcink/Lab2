<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/pure-min.css" 
integrity="sha384-nn4HPE8lTHyVtfCBi5yW9d20FjT8BJwUXyWZT9InLYax14RDjBj46LmSztkmNP9w" crossorigin="anonymous">
<title>add author</title>
</head>
<body>
	<div style="width:400px; height:100px; margin:5px auto;">
	<h3>没有找到指定作者，请添加信息</h3>
    <form action="addAuthor" method="post" class="pure-form pure-form-aligned">
		<s:hidden name="authorName" value="%{authorName}" />
		<div class="pure-control-group">
		作者年龄 <input type="text" name="age" />
		</div>
		<div class="pure-control-group">
		作者国籍 <input type="text" name="country" />
		</div>
		<button type="submit" class="pure-button pure-button-primary">下一步</button>
    </form>
    </div>
</body>
</html>