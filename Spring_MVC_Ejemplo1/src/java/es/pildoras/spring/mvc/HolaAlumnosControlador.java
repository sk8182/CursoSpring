/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author julio
 */
@Controller
public class HolaAlumnosControlador {
    
    @RequestMapping("/muestraFormulario")
    public String muestraFormulario(){//este metodo proporciona el formulario
        
        return "HolaAlumnosFormulario";
        
    }
    
    @RequestMapping("/procesarFormulario")
    public String procesarFormulario(){
        
        return "HolaAlumnosSpring";
        
    }
    
}
