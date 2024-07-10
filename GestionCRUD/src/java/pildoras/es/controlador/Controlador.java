/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pildoras.es.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author julio
 */
@Controller
@RequestMapping("/cliente")
public class Controlador {
    
    @RequestMapping("/lista")
    public String listaClientes(Model elModelo){
        
        return "lista-clientes";
        
    }
            
    
}
