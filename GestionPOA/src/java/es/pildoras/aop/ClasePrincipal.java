/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.pildoras.aop;

import es.pildoras.aop.dao.ClienteDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author julio
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Leer la conf de Spring
        
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
        
        
        //Obtener el bean del contenedor de Spring
        
        ClienteDAO elCliente = contexto.getBean("clienteDAO",ClienteDAO.class);
        
        // LLamar al método
        
        elCliente.insertaCliente();
        
        //Cerrar el contexto
        
        contexto.close();
        
    }
    
}
