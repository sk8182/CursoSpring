
package es.pildoras.IoC;

/**
 *
 * @author julio
 */
public class JefeEmpleado implements Empleados{
    
    
    //Creación de campo tipo  creacion de informes (interfaz)
    private CreacionInformes informeNuevo;
    
    //Creación de constructor que inyecta dependencia
    public JefeEmpleado(CreacionInformes informeNuevo) {
        
        this.informeNuevo = informeNuevo;
        
    }
    
    @Override
    public String getTareas(){
        
        return "Gestiono las cuestiones relativas a mis empleados de sección";
    }

    @Override
    public String getInforme() {
        return "Informe presentado por el Jefe con arreglos: " + informeNuevo.getInforme(); 
    }
    
}
