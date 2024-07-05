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
public class GuardaClientePrueba {

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
            
            Clientes cliente1= new Clientes("Josefa","Ramona","Plaza Sol");
            
            miSession.beginTransaction();
            
            miSession.save(cliente1);
            
            miSession.getTransaction().commit();
            
            System.out.println("Registro insertado correctamente en BBDD");
            
            
            //Lectura de registro
            
            miSession.beginTransaction();
            
            System.out.println("Lectura del registro con ID: " + cliente1.getId());
            
            Clientes clienteInsertado = miSession.get(Clientes.class, cliente1.getId());
            
            System.out.println("Registro: " + clienteInsertado);
            
            miSession.getTransaction().commit();
            
            System.out.println("Finalizado!");
           
            
        } finally {
        
            miSession.close();
            
            miFactory.close();
        
        }
        
        
    }
    
}
