/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.pildoras.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/**
 *
 * @author julio
 */
public class ActualizaClientes {

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
            
            //int clienteId = 2;
            
            miSession.beginTransaction();
            
            //----------------------UPDATE POR VARIABLE (clienteId))
            //Clientes miCliente = miSession.getReference(Clientes.class, clienteId);
            
            //miCliente.setNombre("Paco");
            
            //--------------------------------UPDATE CON LIKE
            //miSession.createQuery("update Clientes set Apellidos='Dominguez' where Apellidos LIKE 'D%' ").executeUpdate();
            
            //---------------------------------DELETE
            miSession.createQuery("delete Clientes where Direccion = 'Santiago' ").executeUpdate();
            
            miSession.getTransaction().commit();
            
            System.out.println("Registro eliminado correctamente en BBDD");
            
            
            
           
            
        } finally {
        
            miSession.close();
            
            miFactory.close();
        
        }
        
        
    }
    
}
