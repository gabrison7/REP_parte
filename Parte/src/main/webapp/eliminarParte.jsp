<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dao.ParteDAO, vo.ParteVO" %>
<jsp:useBean id="e" class="vo.ParteVO"></jsp:useBean>
<jsp:setProperty property="id" name="e"></jsp:setProperty>
    

    <%
	ParteDAO.eliminar(e);
	response.sendRedirect("listarPartes.jsp");
%>