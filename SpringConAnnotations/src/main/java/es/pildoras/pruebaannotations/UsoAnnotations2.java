/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author julio
 */
public class UsoAnnotations2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
     * @param args the command line arguments
     */
   
        
        
        //leer el xml de configuracion
        
        //ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //leer el class de configuracion
        
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
        
        //pedir un Bean al contenedor
        
        Empleados empleado = contexto.getBean("directorFinanciero", Empleados.class);
        
        System.out.println(empleado.getTareas());
        System.out.println(empleado.getInforme());
        
        
//        Empleados Antonio = contexto.getBean("comercialExperimentado", Empleados.class);
//        
//        Empleados Lucia = contexto.getBean("comercialExperimentado", Empleados.class);
//        
//        
//        //apuntan al mismo objeto en memoria???????????
//        if(Antonio==Lucia){
//         
//            System.out.println("Apuntan al mismo lugar en memoria");//si no toco nada apunta al mismo objeto (SINGLETON)
//            System.out.println(Antonio +"\n"+ Lucia);
//        
//        }else{
//            
//            System.out.println("NO apuntan al mismo lugar en memoria");//defino Scope prototype en la clase comercialExperimentado
//            System.out.println(Antonio +"\n"+ Lucia);
//        }
//        
        //cerrar el contexto
        
        contexto.close();
        
        
        
    }
    
}
