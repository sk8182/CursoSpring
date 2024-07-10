/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pildoras.es.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pildoras.es.controlador.entity.Cliente;
import pildoras.es.dao.ClienteDAO;

/**
 *
 * @author julio
 */
@Controller
@RequestMapping("/cliente")
public class Controlador {
    
    @Autowired
    private ClienteDAO clienteDao;
    
    @RequestMapping("/lista")
    public String listaClientes(Model elModelo){
        
        //Obtener los clientes desde el DAO
        
        List<Cliente> losClientes = clienteDao.getClientes();
        
        //Agregar los clientes al modelo
        
        elModelo.addAttribute("clientes",losClientes);
        
        
        return "lista-clientes";
        
    }
    
  
            
    
}
