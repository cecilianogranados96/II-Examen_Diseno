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
public class Validar_Direccion  implements Validar<Info_Usuario>  {
     @Override
    public List<String> validar(Info_Usuario info) {
        List<String> errors = new ArrayList();

        Direccion address = info.getAddress();

        if (address == null) {
            errors.add("Direccion Vacia");
        } else {
            errors.addAll(validateAddress(address));

        }
        
        return errors;
    }

    private List<String> validateAddress(Direccion address) {
        List<String> errors = new ArrayList();
        
        String line1 = address.getLinea1();
        String city = address.getCiudad();
        String postcode = address.getCodigo_postal();

        if (line1.isEmpty()) {
            errors.add("Linea 1 Vacio");
        }

        if (city.isEmpty()) {
            errors.add("Ciudad Vacio");
        }

        if (postcode.isEmpty()) {
            errors.add("Codigo Postal Vacio");
        }
        return errors;
    }
    
}
