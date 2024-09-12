/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.proyectorest.rest;

import es.pildoras.proyectorest.entidad.Empleado;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
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
    public Empleado getEmpleado(@PathVariable int empleadoId) {
        
        return losEmpleados.get(empleadoId);

    }

}
