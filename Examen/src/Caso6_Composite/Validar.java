/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso6_Composite;

import java.util.List;

/**
 *
 * @author Jose
 * @param <T>
 */
public interface Validar<T>  {
    List<String> validar(T info);
}
