<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="dao.ParteDAO, vo.ParteVO" %>
<jsp:useBean id="e" class="vo.ParteVO"></jsp:useBean>
<jsp:setProperty property="id" name="e"></jsp:setProperty>
    
<%
int id = e.getId();
ParteVO parte = ParteDAO.obtenerPartesId(id);
%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="guardarParte.jsp" method="post">
    
        <header><img src="logo.jpg"></img></header>
        
        <h5>Amonestación por conducta contraria a las normas de convivencia</h5>
        <p id="inicio">
            Sr. De <input type="text" id="senor" value<%= e.getSenor()%>><br>
            C/Pl/Avda <input type="text" id="direccionInicio" value<%= e.getDireccion() %>><br>
            CP <input type="text" id="cp" <%= e.getCp() %>><br>
            Ciudad <input type="text" id="ciudad" <%= e.getCiudad() %>>
        </p>
        <h1>ASUNTO: Amonestación por conducta contraria a las normas de convivencia</h1>
        <p id="principal">
            Muy señores nuestros:
            En consonancia con el decreto 50/2007, de 20 de marzo, por el que se establecen
            los derechos y deberes <br> del alumno y normas de convivencia en los centros docentes,
            nos ponemos ben contacto con ustedes para informarles del comportamiento <br> que su hijo/a
            <textarea name="hijo" id="hijo" cols="70" rows="1 " value<%= e.getAlumno() %>></textarea> del curso <input type="text" id="curso" value<%= e.getCurso() %>>, ha tenido
            <br> en el centro el día (fecha en el que sucede la conducta contraria): 
            <input type="text" name="fecha" id="fecha" value<%= e.getFecha() %>>
            <textarea name="motivos" id="motivos" cols="130" rows="10" value<%= e.getMotivos() %>></textarea>
            
            <br><br><br>

            Siguiendo el citado decreto, su hijo/a recibe este apercibimiento por escrito. Del cual se guarda
            copia en el informe individual del alumno.

            <br><br><br>

            Se llama a la familia el día 
            <input type="text" name="diaCita" id="diaCita" value<%= e.getDiaCita() %>>
            a las 
            <input type="text" name="horaCita" id="horaCita" value<%= e.getHoraCita() %>>
            horas.<br>
            Persona a la que se comunica la amonestación 
            <textarea name="hijo" id="persona" cols="84" rows="1" value<%= e.getPersona() %>></textarea><br>
            (si no se ha contactado, se señalará igualmente).

            <br><br><br>

            Para cualquier aclaración, póngase en contacto con el Centro.

            <h2>Navalmoral de la Mata, a <input type="text" id="fechaFirma" value<%= e.getFechaFirma() %>></h2>

            <br><br><br><br>

            Fdo. Raúl Garrido Jiménez <br>
            Jefe de Estudios

            <h3>Fdo. 
            <input type="text" id="firmaProf" value<%= e.getProfesorFirma() %>><br>
            </h3>
        </p>

        <p id="letraPeq">
        <h4>R.O.F. Art, 23 (D. y D.37.4)</h4>
        Las conductas contrarias a las normas de convivencia determinadas en este
        artículo prescribirán en el plazo de sesenta días naturales contados a <br>partir 
        de la fecha de su comisión, excluyendo los periodos vacacionales establecidos 
        en el correspondiente calendario escolar.
        <h4>R.O.F. Art, 33 (D. y D.40.2)</h4>
        Las conductas gravemente perjudiciales para la convivencia en el Centro prescribirán
        a los cuatro meses contados a partir de la fecha de su comisión, excluyendo los periodos
        vacacionales establecidos en el calendario escolar.
        </p>
        
        <input type="submit" value="Enviar datos"></input><input type="reset" value="ELiminar"></input>
    </form>

</body>
</html>