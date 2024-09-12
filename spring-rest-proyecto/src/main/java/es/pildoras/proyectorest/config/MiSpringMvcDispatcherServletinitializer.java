/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.proyectorest.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author julio
 */
public class MiSpringMvcDispatcherServletinitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        
        return new Class[]{AppConfig.class};//devuelve las clases de Config
        
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"}; // devuelve la raiz
    }
    
}
