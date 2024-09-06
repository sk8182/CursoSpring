/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.aop.dao;

import org.springframework.stereotype.Component;

import es.pildoras.aop.dao.Cliente;

/**
 *
 * @author julio
 */
@Component("clienteDAO")
public class ClienteDAO {

    
//    public String insertaCliente() {
//
//        System.out.println("Trabajo realizado ok. Cliente insertado con éxito");
//        
//        return "Cliente insertado correctamente";
//    }
    
    public void insertaCliente(Cliente elCliente, String tipo){
        
        System.out.println("Trabajo realizado ok. Cliente insertado con éxito");
        
    }

}
