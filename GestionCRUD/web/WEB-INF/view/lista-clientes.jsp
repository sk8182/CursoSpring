<%-- 
    Document   : lista-clientes
    Created on : 10 jul 2024, 14:57:20
    Author     : julio
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilos.css"/>
        
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de clientes</h1>
        
        <table border="1">
            
            <tr>
                
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Email</th>
                
                <th>Modificar</th>
                
            </tr>
            
            <c:forEach var="clienteTemp" items="${clientes}">
                
                <c:url var="linkActualizar" value="/cliente/muestraFormularioActualizar">
                    <c:param name="clienteId" value="${clienteTemp.id}"/>
                </c:url>
                
                <tr>
                    
                    <td>${clienteTemp.nombre}</td>
                    <td>${clienteTemp.apellido}</td>
                    <td>${clienteTemp.email}</td>
                    
                    <td><a href="${linkActualizar}"><input type="button" value="Modificar"/></a></td>
                    
                </tr>
                
            </c:forEach>
            
        </table>
        
        <br/>
        
        <input type="button" value="Agregar Cliente" onclick="window.location.href='muestraFormularioAgregar';return false;"/>
        
    </body>
</html>
