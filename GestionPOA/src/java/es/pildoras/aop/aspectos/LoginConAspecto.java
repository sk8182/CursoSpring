/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *
 * @author julio
 */
@Aspect
@Component
public class LoginConAspecto {
    
    
//    @Pointcut("execution(public * insertaCliente*(..))")//para no copiar la ruta del @Before en todas las lineas
//    private void paraClientes(){
//        
//    }
    
     @Pointcut("execution(public * insertaCliente(..))")//esta solo en los clientes normales realiza la comprobación.
    private void paraClientes(){
        
    }
    
    //@Before("execution(public void es.pildoras.aop.dao.ClienteVIPDAO.insertaCliente())")//esto es un ejemplo de PointCut Expression
    //@Before("execution(public * insertaCliente*())")//esto es otro ejemplo de PointCut Expression, donde el asterisco nos filtra los tipos de datos que devuelve o no devuelve (String y void) y lo que viene despues del asterisco tb
    //@Before("execution(public * insertaCliente*(es.pildoras.aop.dao.Cliente,..))")//así para pasar parametros
    @Before("paraClientes()")//así para pasar todo
    public void antesInsertarCliente(){
        
        System.out.println("El usuario está logueado");
        
        System.out.println("El perfil para insertar clientes es correcto");
        
    }
    
    @Before("paraClientes()")
    public void requisitosCliente(){
        
        System.out.println("El cliente cumple los requisitos para ser insertado en la BBDD");
        
    }
    
    @Before("paraClientes()")
    public void requisitosTabla(){
        
        System.out.println("La tabla contiene menos de 3000 registros, puedes insertar el nuevo cliente");
        
    }
}
