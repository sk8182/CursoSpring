<%-- 
    Document   : newFile
    Created on : 1 jul 2024, 17:14:39
    Author     : julio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de registro</title>
    </head>
    <body>
        
        <form:form action="procesarFormulario" modelAttribute="elAlumno">
            
            
            Nombre: <form:input path="nombre"/><%-- los path a de ser el nombre del atributo (cuando enviamos se hace uso de setters)--%>
            
            <br/><br/><br/>
            
            Apellido: <form:input path="apellido"/>
            
            <br/><br/><br/>
            
            Asignaturas Optativas:<br/>
            
            <form:select path="optativa" multiple="true">
                
                <form:option value="Diseño" label="Diseño"/>
                <form:option value="Karate" label="Karate"/>
                <form:option value="Comercio" label="Comercio"/>
                <form:option value="Danza" label="Danza"/>
                
            </form:select>    
            
            <br/><br/><br/>
            
            Barcelona <form:radiobutton path="ciudadEstudios" value="Barcelona"></form:radiobutton>
            Madrid <form:radiobutton path="ciudadEstudios" value="Madrid"></form:radiobutton>
            Valencia <form:radiobutton path="ciudadEstudios" value="Valencia"></form:radiobutton>
            Bilbao <form:radiobutton path="ciudadEstudios" value="Bilbao"></form:radiobutton>
                              
            <br/><br/><br/>
            
            Inglés <form:checkbox path="idiomasAlumno" value="Inglés"></form:checkbox>
            Francés <form:checkbox path="idiomasAlumno" value="Francés"></form:checkbox>
            Alemán <form:checkbox path="idiomasAlumno" value="Alemán"></form:checkbox>
            Chino <form:checkbox path="idiomasAlumno" value="Chino"></form:checkbox>
            
            <br/><br/><br/>
            
            <input type="submit" value="Enviar">
            
            
            
        </form:form>
        
        
        
    </body>
</html>
