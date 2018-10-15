/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso6_Composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose
 */
public class Composite_Validar<T> implements Validar<T> {
    private final List<Validar<T>> validators;

    public Composite_Validar(List<Validar<T>> validators) {
        this.validators = validators;
    }

    @Override
    public List<String> validar(T info) {
        List<String> errors = new ArrayList();

        for (Validar validator : validators) {
            errors.addAll(validator.validar(info));
        }
        
        return errors;
    }

}
