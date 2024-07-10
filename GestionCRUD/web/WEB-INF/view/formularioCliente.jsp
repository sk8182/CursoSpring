<%-- 
    Document   : formularioCliente
    Created on : 10 jul 2024, 20:16:14
    Author     : julio
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilos.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        
        <form:form action ="insertarCliente" modelAttribute="cliente" method="POST">
            
            <form:hidden path="id"/>
            
            <table>
                
                <tr>
                    
                    <td>Nombre: </td>
                    <td><form:input path="nombre"/></td>
                    
                </tr>
                
                <tr>
                    
                    <td>Apellido: </td>
                    <td><form:input path="apellido"/></td>
                    
                </tr>
                
                <tr>
                    
                    <td>Email: </td>
                    <td><form:input path="email"/></td>
                    
                </tr>
                
                <tr>
                    
                    <td colspan="2"><input type="submit" value="Insertar"/></td>
                   
                    
                </tr>
                
            </table>
            
            
            
        </form:form>
        
    </body>
</html>
