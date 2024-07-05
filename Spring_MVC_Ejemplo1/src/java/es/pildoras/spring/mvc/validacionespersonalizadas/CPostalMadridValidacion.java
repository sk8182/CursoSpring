/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.spring.mvc.validacionespersonalizadas;

import java.lang.annotation.Annotation;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author julio
 */
public class CPostalMadridValidacion implements ConstraintValidator<CPostalMadrid, String>{

    private String prefijoCodigoMadrid;
    
    @Override
    public void initialize(CPostalMadrid elCodigo) {
        prefijoCodigoMadrid = elCodigo.value();
    }

    @Override
    public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
        
        boolean valCodigo;
        
        if(arg0 != null) valCodigo=arg0.startsWith(prefijoCodigoMadrid);
        else return valCodigo=true;
        
        return valCodigo;
        
    }
    
    

    
}
