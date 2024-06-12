package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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

        /*
        //Creación de tipo empleado
        
        Empleados Empleado1 = new DirectorEmpleado();
        
        
        //Uso de los objetos creados
        
        System.out.println(Empleado1.getTareas());**/

        //cargo archivo xml    
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //utilizo el contexto
       // Empleados Juan = (Empleados) contexto.getBean("miEmpleado", Empleados.class);
        
        Empleados Maria = (Empleados) contexto.getBean("miSecretarioEmpleado", Empleados.class);
        
        
        System.out.println("");
        System.out.println("");
      
        
        System.out.println(Maria.getTareas());
        
        System.out.println(Maria.getInforme());
        
        
        
        System.out.println("");
        System.out.println("");
        
        contexto.close();
    

    }

}
