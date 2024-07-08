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
public class InsertaCliente {

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

            Cliente cliente1 = new Cliente("Sandra", "Delgado", "Goya");

            DetallesCliente detallesCliente1 = new DetallesCliente("www.pildorasinformaticas.es", "123456", "Primer Cliente");

            //asociar los objetos
            cliente1.setDetallesCliente(detallesCliente1);

            miSession.beginTransaction();

            //esto guarda la info en las dos tablas relacionadas
            miSession.save(cliente1);

            miSession.getTransaction().commit();

            System.out.println("Registro insertado correctamente en BBDD");

        } finally {

            miSession.close();

            miFactory.close();

        }

    }

}
