/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

import org.springframework.stereotype.Component;

/**
 *
 * @author julio
 */
@Aspect
@Component
@Order(1)
public class RequisitosCliente {
    
    @Before("es.pildoras.aop.aspectos.LoginConAspecto.paraClientes()")
    public void requisitosCliente() {

        System.out.println("El cliente cumple los requisitos para ser insertado en la BBDD");

    }
    
}
