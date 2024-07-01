
package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author julio
 */
@Controller
@RequestMapping("/alumno")
public class AlumnoController {
    
    @RequestMapping("/muestraFormulario")
    public String muestraFormulario(Model modelo){
        
        Alumno elAlumno = new Alumno();
        
        modelo.addAttribute("elAlumno", elAlumno);
        
        return "alumnoRegistroFormulario";
                
        
    }
    
}
