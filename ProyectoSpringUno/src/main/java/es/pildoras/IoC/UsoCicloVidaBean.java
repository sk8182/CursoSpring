
package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author julio
 */
public class UsoCicloVidaBean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        //cargar el xml de conf
        
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
        
        //obtenemos el BEAN
        
        Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
        
        System.out.println("");
        System.out.println("");
        
        System.out.println(Juan.getInforme());
        
        System.out.println("");
        System.out.println("");
        //cerrar el contexto
        
        contexto.close();
        
    }
    
}
