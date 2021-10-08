<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ page import="dao.ParteDAO, vo.ParteVO" %>
<%@ page import="java.util.List" %>

<h1>Lista de partes</h1>


<%
List<ParteVO> lista = ParteDAO.obtenerPartes();
request.setAttribute("lista", lista);
System.out.println(lista.size());
%>

<table>
<tr>
	<th>ID</th>
	<th>Señor</th>
	<th>Direccion</th>
	<th>CP</th>
	<th>Ciudad</th>
	<th>Alumno</th>
	<th>Curso</th>
	<th>Fecha</th>
	<th>Motivos</th>
	<th>Dia Cita</th>
	<th>Hora Cita</th>
	<th>Persona</th>
	<th>FechaFirma</th>
	<th>ProfesorFirma</th>
	<th>Editar</th>
	<th>Eliminar</th>
</tr>

<c:forEach items="${lista}" var="parte">
<tr>
	<td>${parte.getId()}</td>
	<td>${parte.getSenor()}</td>
	<td>${parte.getDireccion()}</td>
	<td>${parte.getCp()}</td>
	<td>${parte.getCiudad()}</td>
	<td>${parte.getAlumno()}</td>
	<td>${parte.getCurso()}</td>
	<td>${parte.getFecha()}</td>
	<td>${parte.getMotivos()}</td>
	<td>${parte.getDiaCita()}</td>
	<td>${parte.getHoraCita()}</td>
	<td>${parte.getPersona()}</td>
	<td>${parte.getFechaFirma()}</td>
	<td>${parte.getProfesorFirma()}</td>
	
	
	
	<td><a href="formularioEditarPartes.jsp?id=${parte.getId()}"><i class="fa fa-edit"></i><input type="button" value="Editar"></a></td>
	<td><a href="eliminarParte.jsp?id=${parte.getId()}"><i class="fa fa-trash"></i><input type="button" value="Eliminar"></a></td>
</tr>
</c:forEach>

</table>


</body>
</html>