/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.aop.aspectos;

import es.pildoras.aop.dao.Cliente;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 * @author julio
 */
@Aspect
@Component
@Order(2)//Orden de ejecucion del aspecto!!!!!!!!!!!!
public class LoginConAspecto {
    
    
    //metodo que procesa datos depues de la excepcion
    
    @AfterThrowing(pointcut = "execution(* es.pildoras.aop.dao.ClienteDAO.encuentraClientes(..))",throwing = "LaExcepcion")
    public void procesandoDatosAfterExceptionEncuentraClientes(Throwable LaExcepcion){
        
        System.out.println("Aquí se están ejecutando de forma automatica las tareas tras excepción");
        
    }
    
    
    //despues de obtener la lista de clientes funciona este metodo
    
    @AfterReturning(pointcut="execution(* es.pildoras.aop.dao.ClienteDAO.encuentraClientes(..))", returning="listaDeClientes")//este es el que hace la inyección de dependencia
    public void tareaTrasEncontrarClientes(List<Cliente> listaDeClientes){
        
        for(Cliente cl: listaDeClientes){
            
            
            
            if(cl.getTipo()=="VIP"){
                
                procesadoDatosAfterReturning(listaDeClientes);
                
                System.out.println("Existen clientes VIP en el listado. Nombre: "+cl.getNombre());
            }
            
        }
        
    }


    @Pointcut("execution(* es.pildoras.aop.dao.*.*(..))")//actua en cualkier metodo, se llame como se llame y tengan los param q tengan
    public void paraClientes() {
 
    }
       

    @Before("paraClientes()")//así para pasar todo
    public void antesInsertarCliente(JoinPoint miJoin) {//punto de intercepcion (JoinPoint)

        
        System.out.println("El usuario está logueado");

        System.out.println("El perfil para insertar clientes es correcto");
        
        Object[] argumentos = miJoin.getArgs();
        
        for(Object temp : argumentos){
            if(temp instanceof Cliente){
                Cliente elCliente = (Cliente)temp;
                
                System.out.println("Nombre del cliente: "+elCliente.getNombre());
                System.out.println("Tipo de cliente: "+elCliente.getTipo());
            }
        }

    }

    private void procesadoDatosAfterReturning(List<Cliente> listaDeClientes) {
        
        for (Cliente cl: listaDeClientes){
            String datosProcesados = "V.I.P " + cl.getNombre().toUpperCase();
            cl.setNombre(datosProcesados);
        }
    }

  
}
