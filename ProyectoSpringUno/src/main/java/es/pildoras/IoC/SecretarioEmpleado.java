
package es.pildoras.IoC;

/**
 *
 * @author julio
 */
public class SecretarioEmpleado implements Empleados {

    
    //Creación de campo tipo  creacion de informes (interfaz)
    private CreacionInformes informeNuevo;
    
    private String email;
    
    private String nombreEmpresa;
    
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
    
    
    
}
