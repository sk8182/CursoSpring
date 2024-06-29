
package es.pildoras.pruebaannotations;

/**
 *
 * @author julio
 */
public class DirectorFinanciero implements Empleados {
    
    private CreacionInformeFinanciero informeFinanciero;

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
    
    
    
}
