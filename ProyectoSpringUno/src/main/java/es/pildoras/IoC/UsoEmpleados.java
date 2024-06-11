
package es.pildoras.IoC;

/**
 *
 * @author julio
 */
public class UsoEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creación de tipo empleado
        
        Empleados Empleado1 = new DirectorEmpleado();
        
        
        //Uso de los objetos creados
        
        System.out.println(Empleado1.getTareas());
    }
    
}
