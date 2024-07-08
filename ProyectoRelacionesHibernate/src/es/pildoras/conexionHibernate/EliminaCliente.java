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
public class EliminaCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Crear un objeto Configuration y configurarlo
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class).addAnnotatedClass(DetallesCliente.class);

        // Construir el SessionFactory a partir de la Configuration
        SessionFactory miFactory = configuration.buildSessionFactory();

        // Abrir una sesión
        Session miSession = miFactory.openSession();

        try {

           
            miSession.beginTransaction();
            
            Cliente elCliente= miSession.get(Cliente.class, 3);
            
            if(elCliente!=null){
                
                System.out.println("Voy a eliminar al cliente "+ elCliente.getNombre());
                
                miSession.delete(elCliente);
                
            }

            miSession.getTransaction().commit();

            if(elCliente!=null) System.out.println("Registro eliminado correctamente en BBDD");
            else System.out.println("No se encontro el cliente");

        } finally {

            miSession.close();

            miFactory.close();

        }

    }

}
