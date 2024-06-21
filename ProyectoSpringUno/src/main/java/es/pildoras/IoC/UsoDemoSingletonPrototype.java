
package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author julio
 */
public class UsoDemoSingletonPrototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        //cargo archivo xml de conf
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
        
        
        //petición de BEANS al contenedor Spring 
        
        SecretarioEmpleado Maria = (SecretarioEmpleado) contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
        
        SecretarioEmpleado Pedro = (SecretarioEmpleado) contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);//estos dos beans apuntan al mismo objeto
        
        SecretarioEmpleado Manolo = (SecretarioEmpleado) contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
        
        SecretarioEmpleado Juan = (SecretarioEmpleado) contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
        
        SecretarioEmpleado Ana = (SecretarioEmpleado) contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
        
        System.out.println(Maria);
        
        System.out.println(Pedro);
        
        System.out.println(Manolo);
        
        System.out.println(Juan);
        
        System.out.println(Ana);
        
        if(Maria==Pedro) System.out.println("Apuntan al mismo objeto");
        else System.out.println("No apuntan al mismo objeto");
        
        
        
    }
    
}
