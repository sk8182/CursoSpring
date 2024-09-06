/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.aop.aspectos;

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


    @Pointcut("execution(* es.pildoras.aop.dao.*.*(..))")//actua en cualkier metodo, se llame como se llame y tengan los param q tengan
    public void paraClientes() {

    }
       
    
    

    
    @Before("paraClientes()")//así para pasar todo
    public void antesInsertarCliente() {

        System.out.println("El usuario está logueado");

        System.out.println("El perfil para insertar clientes es correcto");

    }

    

   
}
