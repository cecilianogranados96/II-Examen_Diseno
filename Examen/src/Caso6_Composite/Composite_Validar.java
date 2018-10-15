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
    private final List<Validar<T>> validadores;

    public Composite_Validar(List<Validar<T>> validadores) {
        this.validadores = validadores;
    }

    @Override
    public List<String> validar(T info) {
        List<String> errores = new ArrayList();
        for (Validar validator : validadores) {
            errores.addAll(validator.validar(info));
        }
        return errores;
    }

}
