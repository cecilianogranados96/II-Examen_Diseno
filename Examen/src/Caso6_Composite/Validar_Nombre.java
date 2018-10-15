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
public class Validar_Nombre  implements Validar<Info_Usuario> {
    
     public List<String> validar(Info_Usuario info) {
        List<String> errors = new ArrayList();

        String name = info.getName();
        String surname = info.getSurname();

        if (name.isEmpty()) {
            errors.add("Nombre Vacio");
        }
        
        if (surname.isEmpty()) {
            errors.add("Apellido Vacio");
        }
        
        return errors;
    }
     
     
     
}
