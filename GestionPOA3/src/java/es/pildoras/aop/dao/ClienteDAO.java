/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.aop.dao;

import org.springframework.stereotype.Component;

import es.pildoras.aop.dao.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julio
 */
@Component("clienteDAO")
public class ClienteDAO {

    public void insertaCliente(Cliente elCliente, String tipo) {

        System.out.println("Trabajo realizado ok. Cliente insertado con éxito");

    }

    public List<Cliente> encuentraClientes() {

        List<Cliente> listaClientes = new ArrayList<>();
        //simulo clientes devueltos por BBDD
        Cliente cl1 = new Cliente("María", "Normal");
        Cliente cl2 = new Cliente("Ana", "Normal");
        Cliente cl3 = new Cliente("Sandra", "VIP");
        Cliente cl4 = new Cliente("Antonio", "Normal");
        
        //agregar clientes a la lista
        listaClientes.add(cl1);
        listaClientes.add(cl2);
        listaClientes.add(cl3);
        listaClientes.add(cl4);

        System.out.println("Ejecución finalizada del método encuentraClientes()");
        
        return listaClientes;

    }

}
