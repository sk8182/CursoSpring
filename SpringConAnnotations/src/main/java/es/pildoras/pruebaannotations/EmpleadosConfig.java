
package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author julio
 */
@Configuration //esto dice que nuestra clase será el archivo de configuración
@ComponentScan("es.pildoras.pruebaannotations")//le decimos la ruta
public class EmpleadosConfig {
    
}
