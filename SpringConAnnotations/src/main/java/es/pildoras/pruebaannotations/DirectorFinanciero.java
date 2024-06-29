
package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author julio
 */
public class DirectorFinanciero implements Empleados {
    
    private CreacionInformeFinanciero informeFinanciero;
    
    @Value("${email}")
    private String email;
    @Value("${nombreEmpresa}")
    private String nombreEmpresa;//no han de coincidir con el nombre de la propiedad del archivo externo necesariamente

    public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
        this.informeFinanciero = informeFinanciero;
    }
    

    @Override
    public String getTareas() {
        return "Gestión y direccion de las operaciones financieras de la empresa"; 
    }

    @Override
    public String getInforme() {
        return informeFinanciero.getInformeFinanciero(); 
    }

    public String getEmail() {
        return email;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    
    
    
    
    
}
