<%-- 
    Document   : HolaAlumnosSpring
    Created on : 30 jun 2024, 0:25:54
    Author     : julio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/estilos/miestilo.css">
    </head>
    <body>

        Hola ${param.nombreAlumno}. Bienvenido al curso de Spring

        <p><br><!-- comment -->

        <h2>Atención a todos</h2>

        ${mensajeClaro}


    </p>
    
    <img alt="foto" src="${pageContext.request.contextPath}/recursos/imgs/sandman.jpg">
    
    
    
    
</body>
</html>
