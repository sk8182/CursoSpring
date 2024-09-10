package es.pildoras.seguridadspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author julio
 */

@Controller
public class ElControlador {
    
    @GetMapping("/")
    public String muestraInicio(){
        
        return "inicio";
    }
    
}
