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
public class Validar_Edad implements Validar<Info_Usuario> {
   
     public List<String> validar(Info_Usuario info) {
        List<String> errores = new ArrayList();
        if (info.getEdad() < 18) {
            errores.add("Menor de edad");
        }
        
        return errores;
    }
}
