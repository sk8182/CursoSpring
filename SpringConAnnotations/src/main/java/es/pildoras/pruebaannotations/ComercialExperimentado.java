/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 *
 * @author julio
 */



@Component
public class ComercialExperimentado implements Empleados {
    
    
    //****************podemos crear diferentes inyecciones desde Autowired (constructor, setter o campo de clase privado o no)*******************
    
    @Autowired
    private CreacionInformeFinanciero nuevoInforme;

    /*@Autowired
    public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }*/

    /*@Autowired
    public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }*/
    
    
    
    

    @Override
    public String getTareas() {
        return "Vender,vender y vender más!"; 
    }

    @Override
    public String getInforme() {
       //return "Informe generado por el comercial"; 
       return nuevoInforme.getInformeFinanciero();
    }
    
    
    
}
