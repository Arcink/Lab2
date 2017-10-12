<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/pure-min.css" 
integrity="sha384-nn4HPE8lTHyVtfCBi5yW9d20FjT8BJwUXyWZT9InLYax14RDjBj46LmSztkmNP9w" crossorigin="anonymous">
<title>show title</title>
</head>
<body>
	<div style="width:400px; height:100px; margin:5px auto;">
	<h3>书籍列表</h3>
	<table class="pure-table">
    <s:iterator value="titleLst" id = "title">
	    <tr><td>
	    <a href="queryDetailByTitle?titleName=<s:property value="#title"/>"><s:property value="#title"/></a>
	    </td></tr>
    </s:iterator>
    </table>
    <br/>
	<s:form action="backHome" method="post">
        <button type="submit" class="pure-button pure-button-primary">返回首页</button>
    </s:form>
    </div>
</body>
</html>