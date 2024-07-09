/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.pildoras.conexionHibernate;

import java.util.Date;
import java.util.GregorianCalendar;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author julio
 */
public class ObtenerPedidosCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Crear un objeto Configuration y configurarlo
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class).addAnnotatedClass(DetallesCliente.class).addAnnotatedClass(Pedido.class);

        // Construir el SessionFactory a partir de la Configuration
        SessionFactory miFactory = configuration.buildSessionFactory();

        // Abrir una sesión
        Session miSession = miFactory.openSession();

        try {

            miSession.beginTransaction();

            //obtener el cliente de la tabla cliente de la BBDD
            Cliente elCliente = miSession.get(Cliente.class, 5);
            
            System.out.println("Cliente: "+ elCliente);
            System.out.println("Pedidos: "+ elCliente.getPedidos());

            
            miSession.getTransaction().commit();

            
            
        }catch(Exception e){
            
            e.printStackTrace();

        } finally {

            miSession.close();

            miFactory.close();

        }

    }

}
