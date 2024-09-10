/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.seguridadspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 *
 * @author julio
 */

@Configuration
@EnableWebSecurity
public class SeguridadAppConfig extends SecurityConfigurerAdapter {
    
    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withDefaultPasswordEncoder()
                .username("Juan")
                .password("123")
                .roles("administrador")
                .build());
        manager.createUser(User.withDefaultPasswordEncoder()
                .username("Antonio")
                .password("456")
                .roles("usuario")
                .build());
        manager.createUser(User.withDefaultPasswordEncoder()
                .username("Ana")
                .password("789")
                .roles("ayudante")
                .build());
        manager.createUser(User.withDefaultPasswordEncoder()
                .username("Laura")
                .password("321")
                .roles("administrador")
                .build());
        
        return manager;
    }
   
    
}
