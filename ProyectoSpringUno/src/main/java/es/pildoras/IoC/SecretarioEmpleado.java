
package es.pildoras.IoC;

/**
 *
 * @author julio
 */
public class SecretarioEmpleado implements Empleados {

    
    //Creación de campo tipo  creacion de informes (interfaz)
    private CreacionInformes informeNuevo;
    
    @Override
    public String getTareas() {
        
        return "Gestionar la agenda de los jefes";
    }

    @Override
    public String getInforme() {
        return "Informe generado por el secretario " + informeNuevo.getInforme(); 
    }

    public void setInformeNuevo(CreacionInformes informeNuevo) {
        this.informeNuevo = informeNuevo;
    }
    
    
    
}
