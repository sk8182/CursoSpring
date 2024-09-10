<%@ page language="java" contentType="text/html ; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="ISO-8859-1"><!-- comment -->
        <title>Insert title here</title>
        <style>
            .formatoError{
                
                color:red;
            }
        </style>

    </head>
    <body>

        <h2 style="text-align: center">Página de login</h3>
        
        <form:form action="${pageContext.request.contextPath}/autenticacionUsuario" method="POST">
            
            
            <c:if test="${param.error!=null}">
                
                <strong class="formatoError">Usuario o contraseña incorrectos</strong>
                
            </c:if>
            
            <p>
                
                Usuario: <input type="text" name="username"/>
                
                 
            </p>
            <p>
                
                Usuario: <input type="password" name="password"/>
                
                 
            </p>
            
            <input type="submit" value="Login"/>
            
            
            
        </form:form>

    </body>


</html>