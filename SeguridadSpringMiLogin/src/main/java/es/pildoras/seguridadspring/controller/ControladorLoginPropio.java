/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.seguridadspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author julio
 */
@Controller
public class ControladorLoginPropio {
    
    @GetMapping("/miFormularioLogin")
    public String muestraLoginPropio(){
        
        return"login_nuevo";
        
        
    }
    
}
