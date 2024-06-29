
package es.pildoras.pruebaannotations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author julio
 */
@Configuration //esto dice que nuestra clase será el archivo de configuración
@ComponentScan("es.pildoras.pruebaannotations")//le decimos la ruta
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {
    
    //Definir el bean para InformeFinancieroDtoCompras
    
    @Bean
    public CreacionInformeFinanciero informeFinancieroDtoCompras(){// esto es el id del bean inyectado
        return new InformeFinancieroDtoCompras();
    }
    
    
    //Definir el bean para DirectorFinanciero e inyectar dependencias
    
    @Bean
    public Empleados directorFinanciero(){
        return new DirectorFinanciero(informeFinancieroDtoCompras());
    }
    
    
}
