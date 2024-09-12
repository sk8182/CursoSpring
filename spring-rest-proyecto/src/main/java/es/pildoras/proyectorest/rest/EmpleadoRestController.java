/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.proyectorest.rest;

import es.pildoras.proyectorest.entidad.Empleado;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author julio
 */
@RestController
@RequestMapping("/api")
public class EmpleadoRestController {

    private List<Empleado> losEmpleados;

    @PostConstruct
    public void cargaDatos() {

        losEmpleados = new ArrayList<>();

        losEmpleados.add(new Empleado("Juan", "Díaz"));
        losEmpleados.add(new Empleado("Ana", "Lopez"));
        losEmpleados.add(new Empleado("María", "Martín"));
        losEmpleados.add(new Empleado("Antonio", "Fernandez"));

    }

    @GetMapping("/empleados")
    public List<Empleado> getEmpleados() {

        return losEmpleados;

    }

    @GetMapping("/empleados/{empleadoId}")
    public Empleado getEmpleado(@PathVariable String empleadoId) {

        int id;

        try {
            id = Integer.parseInt(empleadoId);
            
        }catch(NumberFormatException ex){
             
            throw new EmpleadoNoEncontradoExcepcion("El id no es válido, ha de ser un número.");
        }

        //comprueba si existe el empleado con su ID
        if ((id >= losEmpleados.size()) || id < 0) {

            throw new EmpleadoNoEncontradoExcepcion("El id " + id + " no existe. El empleado no se encontró");
        }

        return losEmpleados.get(id);

    }

    @ExceptionHandler
    public ResponseEntity<EmpleadoRespuestaError> manejoExcepcion(EmpleadoNoEncontradoExcepcion ex) {

        EmpleadoRespuestaError error = new EmpleadoRespuestaError();

        error.setEstado(HttpStatus.NOT_FOUND.value());

        error.setMensaje(ex.getMessage());

        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

    }

}
