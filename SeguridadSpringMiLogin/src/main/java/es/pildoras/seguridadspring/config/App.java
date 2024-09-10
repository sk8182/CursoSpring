package es.pildoras.seguridadspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "es.pildoras.seguridadspring")
public class App {
    
    @Bean
    public ViewResolver viewResolver(){       //Crea la instancia para resolver las vistas******************************************
        
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        
        viewResolver.setPrefix("/WEB-INF/view/");//antes del nombre de la vista hay esta ruta
        
        viewResolver.setSuffix(".jsp");  // este es el sufijo de las vistas
        
        return viewResolver;
        
    }
    
}
