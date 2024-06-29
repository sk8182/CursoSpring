package es.pildoras.pruebaannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author julio
 */
@Component
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
    
    
    public ComercialExperimentado() {

    }
    


    //************************************************************Ejecucion de código después de la creación del Bean

    @PostConstruct
    public void ejecutaDespuesCreación() {

        System.out.println("Ejecutado tras de creación de Bean");
    }

    //************************************************************Ejecución de código después de apagado contenedor Spring
    @PreDestroy
    public void ejecutaAntesDestruccion() {

        System.out.println("Ejecutado antes de destrucción");
    }
    
    
    
    
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
