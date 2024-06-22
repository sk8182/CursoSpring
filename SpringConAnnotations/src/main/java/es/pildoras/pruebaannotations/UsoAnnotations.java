/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author julio
 */
public class UsoAnnotations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //leer el xml de configuracion
        
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        
        //pedir un Bean al contenedor
        
        Empleados Antonio = contexto.getBean("ComercialExperimentado", Empleados.class);
        
        
        //usar el Bean
        
        System.out.println(Antonio.getInforme());
        
        System.out.println(Antonio.getTareas());
        
        //cerrar el contexto
        
        contexto.close();
        
    }
    
}
