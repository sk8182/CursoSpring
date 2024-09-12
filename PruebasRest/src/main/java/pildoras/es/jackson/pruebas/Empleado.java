/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pildoras.es.jackson.pruebas;

/**
 *
 * @author julio
 */
public class Empleado {
    
    private int id;
    private String nombre;
    private String apellido;
    private boolean activo;
    private String[] idiomas;
    private Datos_Empleado datos_registro;

    public Empleado() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

    public Datos_Empleado getDatos_registro() {
        return datos_registro;
    }

    public void setDatos_registro(Datos_Empleado datos_registro) {
        this.datos_registro = datos_registro;
    }
    
    
    
    
}
