/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author julio
 */
@Aspect
@Component
public class LoginConAspecto {
    
    //@Before("execution(public void es.pildoras.aop.dao.ClienteVIPDAO.insertaCliente())")//esto es un ejemplo de PointCut Expression
    //@Before("execution(public * insertaCliente*())")//esto es otro ejemplo de PointCut Expression, donde el asterisco nos filtra los tipos de datos que devuelve o no devuelve (String y void) y lo que viene despues del asterisco tb
    //@Before("execution(public * insertaCliente*(es.pildoras.aop.dao.Cliente,..))")//así para pasar parametros
    @Before("execution(public * insertaCliente*(..))")//así para pasar todo
    public void antesInsertarCliente(){
        
        System.out.println("El usuario está logueado");
        
        System.out.println("El perfil para insertar clientes es correcto");
        
    }
    
}
