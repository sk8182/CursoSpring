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
    
    
    private String valoracionClienteNormal;
    private String codigoClienteNormal;

    public String getValoracionClienteNormal() {
        
        System.out.println("Obteniendo valoración del cliente");
        
        return valoracionClienteNormal;
    }

    public void setValoracionClienteNormal(String valoracionClienteNormal) {
        
        System.out.println("Estableciendo valoración del cliente");
        
        this.valoracionClienteNormal = valoracionClienteNormal;
    }

    public String getCodigoClienteNormal() {
        
        System.out.println("Obteniendo código del cliente");
        
        return codigoClienteNormal;
    }

    public void setCodigoClienteNormal(String codigoClienteNormal) {
        
        System.out.println("Estableciendo código del cliente");
        
        this.codigoClienteNormal = codigoClienteNormal;
    }
    
    
    

}
