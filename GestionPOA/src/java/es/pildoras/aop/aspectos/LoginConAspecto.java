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
    
    @Before("execution(public void insertaCliente())")
    public void antesInsertarCliente(){
        
        System.out.println("El usuario está logueado");
        
        System.out.println("El perfil para insertar clientes es correcto");
        
    }
    
}
