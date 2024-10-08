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
    
    // agregar mapeo a administradores
    
    @GetMapping("/administradores")
    public String muestraAdministradores(){
        
        return "administradores";
    }
    
    @GetMapping("/acceso-denegado")
    public String muestraAccesoDenegado(){
        
        return "acceso-denegado";
    }
    
    // agregar mapeo a ayudantes*********
    
    @GetMapping("/ayudantes")
    public String muestraAyudantes(){
        
        return "ayudantes";
    }
    
}
