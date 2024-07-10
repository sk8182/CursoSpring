/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pildoras.es.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pildoras.es.controlador.entity.Cliente;

/**
 *
 * @author julio
 */
@Repository
public class ClienteDAOclase implements ClienteDAO{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Cliente> getClientes() {
        
        //Obtener la session
        
        Session miSession = sessionFactory.getCurrentSession();
        
        //Crear la consulta (Query)
        
        Query<Cliente> miQuery = miSession.createQuery("from Cliente", Cliente.class);
        
        //Ejecutar la query y devolver resultados
        
        List<Cliente> clientes = miQuery.getResultList();
        
        
        return clientes;
     
    }
    
}
