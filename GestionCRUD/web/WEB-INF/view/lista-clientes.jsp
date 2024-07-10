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
        Hemos llegado a la lista de futuros clientes!!!!
        
        <table>
            
            <tr>
                
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Email</th>
                
            </tr>
            
            <c:forEach var="clienteTemp" items="${clientes}">
                
                <tr>
                    
                    <td>${clienteTemp.nombre}</td>
                    <td>${clienteTemp.apellido}</td>
                    <td>${clienteTemp.email}</td>
                    
                </tr>
                
            </c:forEach>
            
        </table>
        
    </body>
</html>
