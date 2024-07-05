<%-- 
    Document   : confirmacionRegistroAlumno
    Created on : 1 jul 2024, 21:42:44
    Author     : julio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmación de registro</title>
    </head>
    <body>
        
        El alumno con nombre <strong> ${elAlumno.nombre}</strong>, apellido <strong>${elAlumno.apellido}</strong>, edad <strong>${elAlumno.edad}</strong> y email <strong>${elAlumno.email}</strong> se ha registrado con éxito.<br/> 
        La asignatura escogida es <strong>${elAlumno.optativa}</strong><br/>
        La provincia donde iniciará los estudios el alumno es: <strong>${elAlumno.ciudadEstudios}</strong><br/>
        Los idiomas escogidos por el alumno son: <strong>${elAlumno.idiomasAlumno}</strong>
        
        
        
        
    </body>
</html>
