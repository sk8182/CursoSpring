/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.aop.servicios;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Component;

/**
 *
 * @author julio
 */

@Component
public class MedicionServicio {
    
    
    public String getServicio(){
        
        System.out.println("****************EL MÉTODO REALIZANDO SUS TAREAS********************");
        
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException ex) {
            Logger.getLogger(MedicionServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "Servicios terminados";
    }
    
    
    
}
