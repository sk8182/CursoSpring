/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.proyectorest.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author julio
 */
@RestController //indica que la clase es un controlador Rest***********************(Las respuestas se convertiran en JSON y se enviarán como cuerpo)
@RequestMapping("/prueba")
public class ProyectoRestController {

    @GetMapping("/saludo")
    public String saludoPrueba() {

        return "Funciona!! Y estamos vivos!!!";
    }

}
