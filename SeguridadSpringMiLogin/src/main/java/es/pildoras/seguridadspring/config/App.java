package es.pildoras.seguridadspring.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "es.pildoras.seguridadspring")
@PropertySource("classpath:persistencia-mysql.properties")//configurar ruta del nuevo archivo de propiedades
public class App {
    
    //variable que almacena las propiedades leidas del archivo de propiedades
    @Autowired
    private Environment env;
    
    //-------------Sistema de Log para revisiones-----------
    
    private Logger miLogger = Logger.getLogger(getClass().getName());
    
    @Bean
    public ViewResolver viewResolver(){       //Crea la instancia para resolver las vistas
        
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        
        viewResolver.setPrefix("/WEB-INF/view/");//antes del nombre de la vista hay esta ruta
        
        viewResolver.setSuffix(".jsp");  // este es el sufijo de las vistas
        
        return viewResolver;
        
    }
    
    //definir un bean de seguridad
    
    @Bean
    public DataSource seguridadDataSource(){
        
        //Crear pool de conexión
        
        ComboPooledDataSource seguridadDataSource = new ComboPooledDataSource();
        
        //Establecer Driver JDBC
        try {
     
            seguridadDataSource.setDriverClass(env.getProperty("jdbc.driver"));
            
        } catch (PropertyVetoException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Hacer log de las propiedades de conexión
        
        miLogger.info("URL de la BBDD: "+ env.getProperty("jdbc.url"));
        miLogger.info("Usuario conectado a BBDD: "+ env.getProperty("jdbc.user"));
        
        //Establecer las propiedades de la conexión con la BBDD
        
        seguridadDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
        seguridadDataSource.setUser(env.getProperty("jdbc.user"));
        seguridadDataSource.setPassword(env.getProperty("jdbc.password"));
        
        //Establecer las propiedades del pool de conexiones
        
        seguridadDataSource.setInitialPoolSize(env.getProperty("connection.pool.initialPoolSize"));
        
        
        
        
        return seguridadDataSource;
        
        
    }
    
    
    
}
