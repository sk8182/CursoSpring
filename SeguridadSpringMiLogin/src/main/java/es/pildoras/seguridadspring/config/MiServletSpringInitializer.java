
package es.pildoras.seguridadspring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author julio
 */
public class MiServletSpringInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        
       return null; 
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
       
        return new Class[]{App.class};
    }

    @Override
    protected String[] getServletMappings() {
        
        return new String[]{"/"};
        
    }
    
    
}
