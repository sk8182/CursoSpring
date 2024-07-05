/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.pildoras.conexionHibernate;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author julio
 */
public class ConsultaClientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Crear un objeto Configuration y configurarlo
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class);
        
        // Construir el SessionFactory a partir de la Configuration
        SessionFactory miFactory = configuration.buildSessionFactory();
        
        
        // Abrir una sesión
        Session miSession= miFactory.openSession();
        
        try {
            
            
            // comenzar sesion
            miSession.beginTransaction();
            
            //consulta de Clientes
            List<Clientes> losClientes = miSession.createQuery("from Clientes").getResultList();
            
            //mostrar los clientes
            recorreClientesConsultados(losClientes);
            
            //consulta: dame los que se apellidan ----Pepa-----
            losClientes = miSession.createQuery("from Clientes cl where cl.apellidos = 'Pepa'").getResultList();
            
            //mostrarlos 
            recorreClientesConsultados(losClientes);
            
            //muestra los que viven en Gran Via o se apellidan Ramona
            losClientes = miSession.createQuery("from Clientes cl where cl.apellidos = 'Ramona' or cl.direccion = 'Gran Via'").getResultList();
            
            //mostrarlos 
            recorreClientesConsultados(losClientes);
            
        
            //commit
            miSession.getTransaction().commit();
            
            System.out.println("Finalizado!");
            
            
            
        } finally {
            
            miSession.close();
            
            miFactory.close();
            
        }
        
        
    }

    private static void recorreClientesConsultados(List<Clientes> losClientes) {
       
        
        for (Clientes unCliente: losClientes){
            System.out.println(unCliente);
        }
    }
    
}
