/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.pildoras.conexionHibernate;

import java.lang.invoke.MethodHandles;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author julio
 */
public class ObtenerCliente {

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

            //Obtener DetallesCliente
            DetallesCliente DetallesDeCliente = miSession.get(DetallesCliente.class, 1);

            System.out.println(DetallesDeCliente);

            System.out.println(DetallesDeCliente.getElCliente());
            
            System.out.println("Ahora eliminaremos en cascada");
            
            miSession.delete(DetallesDeCliente);

            miSession.getTransaction().commit();

        } catch (Exception ex1) { //es importante capturar las excepciones

            ex1.printStackTrace();

        } finally {

            //Para que no haya leaks es importante cerrar todos los recursos para que no haya LEAKS!!!!!!!!!!!!!!!!
            miSession.close();

            miFactory.close();

        }

    }

}
