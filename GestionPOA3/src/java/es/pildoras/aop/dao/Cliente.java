/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.aop.dao;

/**
 *
 * @author julio
 */
public class Cliente {
    
    private String nombre;
    private String tipo;

    public Cliente(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Cliente() {
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", tipo=" + tipo + '}';
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
