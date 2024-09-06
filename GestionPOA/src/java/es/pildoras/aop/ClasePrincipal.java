/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.pildoras.aop;

import es.pildoras.aop.dao.Cliente;
import es.pildoras.aop.dao.ClienteDAO;
import es.pildoras.aop.dao.ClienteVIPDAO;

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
        
        ClienteVIPDAO elClienteVIP = contexto.getBean("clienteVIPDAO",ClienteVIPDAO.class);
        
        // LLamar al método
        
        Cliente cl1 = new Cliente();
        
        elCliente.insertaCliente(cl1, "Normal");// este es el nombre del metodo que debe coincidir con la anotacion @Before
        
        elClienteVIP.insertaClienteVIP();
        
        elCliente.setCodigoClienteNormal("564564545");
        
        elCliente.setValoracionClienteNormal("positiva");
        
        String codigoCl= elCliente.getCodigoClienteNormal();
        
        String valoraCl= elCliente.getValoracionClienteNormal();



        //Cerrar el contexto
        
        contexto.close();
        
    }
    
}
