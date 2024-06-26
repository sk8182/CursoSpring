/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.spring.mvc;

//import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author julio
 */
@Controller
@RequestMapping("/principal")
public class HolaAlumnosControlador {
    
    @RequestMapping("/muestraFormulario")
    public String muestraFormulario(){//este metodo proporciona el formulario
        
        return "HolaAlumnosFormulario";
        
    }
    
    @RequestMapping("/procesarFormulario")
    public String procesarFormulario(){
        
        return "HolaAlumnosSpring";
        
    }
    
    @RequestMapping("/procesarFormulario2")
    //public String otroProcesoFormulario(HttpServletRequest request, Model modelo){
         
      //  String nombre= request.getParameter("nombreAlumno");
        
    public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model modelo){        
            
        nombre+=" es el mejor alumno";
        
        String mensajeFinal= "¿Quien es el mejor alumno? "+ nombre;
        
        //agregando info al modelo
        
        modelo.addAttribute("mensajeClaro", mensajeFinal);
        
        
        return "HolaAlumnosSpring";
        
    }
    
}
