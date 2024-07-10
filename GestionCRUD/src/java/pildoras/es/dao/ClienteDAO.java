/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pildoras.es.dao;

import java.util.List;
import pildoras.es.controlador.entity.Cliente;

/**
 *
 * @author julio
 */
public interface ClienteDAO {
    
    public List<Cliente> getClientes();

    public void insertarCliente(Cliente elCliente);

    public Cliente getCliente(int id);
    
}
