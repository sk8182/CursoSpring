/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.pildoras.conexionHibernate;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author julio
 */
public class CrearPedidosCliente {

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
            
            //Crear Pedidos del Cliente
            Pedido pedido1 = new Pedido(new Date(120,6,4));
            Pedido pedido2 = new Pedido(new Date(120,5,3));
            Pedido pedido3 = new Pedido(new Date(120,7,2));
            
            //Agregar pedidos creadis al Cliente creado
            elCliente.agregarPedidos(pedido1);
            elCliente.agregarPedidos(pedido2);
            elCliente.agregarPedidos(pedido3);
            
            //Guardar los pedidos en la tabla Pedido
            miSession.save(pedido1);
            miSession.save(pedido2);
            miSession.save(pedido3);

            
            miSession.getTransaction().commit();

            System.out.println("Registros insertado correctamente en BBDD");
            
        }catch(Exception e){
            
            e.printStackTrace();

        } finally {

            miSession.close();

            miFactory.close();

        }

    }

}
