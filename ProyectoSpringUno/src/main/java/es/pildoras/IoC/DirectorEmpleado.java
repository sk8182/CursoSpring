
package es.pildoras.IoC;

/**
 *
 * @author julio
 */
public class DirectorEmpleado implements Empleados {

    //Creación de campo tipo  creacion de informes (interfaz)
    private CreacionInformes informeNuevo;
    
    private String email;
    
    private String nombreEmpresa;
    
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
    //metodo init (Ejecutar tareas antes de que el bean este disponible)
    
    
    public void metodoInicial(){
        
        System.out.println("Dentro del metodo init. Aquí irian las tareas a ejecutar antes de que el Bean esté listo");        
    }
    
    
    //metodo destroy (Ejecutar tareas después de que el bean haya sido utilizado)
    
    public void metodoFinal(){
        
        System.out.println("Dentro del metodo destroy. Aquí irian las tareas a ejecutar despues de que el Bean haya muerto");        
    }
    
    
}
