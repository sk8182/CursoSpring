
package es.pildoras.IoC;

/**
 *
 * @author julio
 */
public class JefeEmpleado implements Empleados{
    
    @Override
    public String getTareas(){
        
        return "Gestiono las cuestiones relativas a mis empleados de sección";
    }
    
}
