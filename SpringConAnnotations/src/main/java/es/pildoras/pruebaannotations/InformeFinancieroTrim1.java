/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

/**
 *
 * @author julio
 */

@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero {

    @Override
    public String getInformeFinanciero() {
        return "Presentacion de informe financiero del trimestre 1"; 
    }
    
}
