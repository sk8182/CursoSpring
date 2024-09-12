/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.proyectorest.rest;

/**
 *
 * @author julio
 */
public class EmpleadoNoEncontradoExcepcion extends RuntimeException{

    public EmpleadoNoEncontradoExcepcion(String message) {
        super(message);
    }

    public EmpleadoNoEncontradoExcepcion(String message, Throwable cause) {
        super(message, cause);
    }

    public EmpleadoNoEncontradoExcepcion(Throwable cause) {
        super(cause);
    }
    
    
    
}
