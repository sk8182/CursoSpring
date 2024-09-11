<%@ page language="java" contentType="text/html ; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>

    <head>
        <meta charset="ISO-8859-1"><!-- comment -->
        <title>Insert title here</title>
        
    </head>
    <body>

        <h1>Bienvenido</h1>
        <hr><!-- comment -->
        <h3>Hemos llegado</h3>
        
        <p>
            
            Usuario: <security:authentication property="principal.username"/>
            <br/>
            <br/>
            Rol: <security:authentication property="principal.authorities"/>
            
        </p>
        <br/>
        
        <!<!-- Link para admin -->
        
        <p>
            
            <a href="${pageContext.request.contextPath}/administradores">ir a zona de administradores</a>
            
        </p>

        <form:form action="${pageContext.request.contextPath}/logout" method="POST">
            
            <input type="submit" value="Logout"/>
            
        </form:form>

    </body>


</html>