/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pildoras.es.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    
    @RequestMapping("/muestraFormularioAgregar")
    public String muestraFormularioAgregar(Model elModelo){
        
        //Bind datos clientes
        
        Cliente elCliente = new Cliente();
        
        elModelo.addAttribute("cliente", elCliente);
        
        return "formularioCliente";
    }
    
    @PostMapping("/insertarCliente")
    public String insertarCliente(@ModelAttribute("cliente") Cliente elCliente){
        
        //insertar cliente en BBDD
        
        clienteDao.insertarCliente(elCliente);
        
        
        
        return "redirect:/cliente/lista";
        
    }
    
    @GetMapping("/muestraFormularioActualizar")
    public String muestraFormularioActualizar(@RequestParam("clienteId") int id, Model elModelo){
        
       
        //Obtener el cliente
        
        Cliente elCliente = clienteDao.getCliente(id);
        
        
        //Establecer el cliente como atributo del modelo
        
        elModelo.addAttribute("cliente", elCliente);
        
        
        //Enviar al formulario


        return "formularioCliente";
    }
    
    @GetMapping("/eliminar")
    public String eliminarCliente(@RequestParam("clienteId") int id){
        
       
        //eliminar el cliente
        
        clienteDao.eliminaCliente(id);
     
        
        //Redireccionar a la lista

        return "redirect:/cliente/lista";
    }
    
  
  
}
