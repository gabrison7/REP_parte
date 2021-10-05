<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dao.ParteDAO" %>
<jsp:useBean id="e" class="vo.ParteVO"></jsp:useBean>
<jsp:setProperty property="*" name="e"/>

<%

int resultado = ParteDAO.guardarAmonestacion(e);
if(resultado>0){
	response.sendRedirect("exitoGuardarParte.jsp");
} else{
	response.sendRedirect("errorGuardarParte.jsp");
}

%>







<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>