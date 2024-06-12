
package es.pildoras.IoC;

/**
 *
 * @author julio
 */
public class SecretarioEmpleado implements Empleados {

    
    @Override
    public String getTareas() {
        
        return "Gestionar la agenda de los jefes";
    }

    @Override
    public String getInforme() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
