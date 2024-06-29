
package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
 *
 * @author julio
 */



@Component
@Scope("prototype")
public class ComercialExperimentado implements Empleados {
    
    
    //****************podemos crear diferentes inyecciones desde Autowired (constructor, setter o campo de clase privado o no)*******************
    
    @Autowired
   //Bean id que debe utilizar
    @Qualifier("informeFinancieroTrim2")//---------------------Con qualifyer le decimos que clase empezando en minusculas************************************
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
