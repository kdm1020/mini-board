<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String test = (String)request.getAttribute("test");
%>
<%=test%>
<br>난 로그인 화면 만들예정.
</body>
</html>