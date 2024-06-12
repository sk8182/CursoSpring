
package es.pildoras.IoC;

/**
 *
 * @author julio
 */
public class DirectorEmpleado implements Empleados {

    //Creación de campo tipo  creacion de informes (interfaz)
    private CreacionInformes informeNuevo;
    
    //Creación de constructor que inyecta dependencia
    public DirectorEmpleado(CreacionInformes informeNuevo) {
        
        this.informeNuevo = informeNuevo;
        
    }

    

    @Override
    public String getTareas() {
        return "Gestionar la plantilla de la empresa";
    }

    @Override
    public String getInforme() {
        return "Informe creado por el director: " + informeNuevo.getInforme(); 
    }
    
}
