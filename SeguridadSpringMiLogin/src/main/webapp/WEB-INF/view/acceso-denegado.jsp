<%-- 
    Document   : acceso-denegado
    Created on : 11 sept 2024, 10:07:35
    Author     : julio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 style="text-align: center">Acceso restringido. No tienes el perfil necesario para acceder</h1>
        <br/>
        <br/>
        <a href="${pageContext.request.contextPath}/">Volver al inicio</a>
    </body>
</html>
