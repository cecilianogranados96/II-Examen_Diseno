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
        List<String> errores = new ArrayList();

        Direccion direccion = info.getDireccion();
        if (direccion == null) {
            errores.add("Direccion Vacia");
        } else {
            errores.addAll(validar_direccion(direccion));
        }
        return errores;
    }

    private List<String> validar_direccion(Direccion direccion) {
        List<String> errores = new ArrayList();

        if (direccion.getLinea1().isEmpty()) {
            errores.add("Linea 1 Vacio");
        }

        if (direccion.getCiudad().isEmpty()) {
            errores.add("Ciudad Vacio");
        }

        if (direccion.getCodigo_postal().isEmpty()) {
            errores.add("Codigo Postal Vacio");
        }
        return errores;
    }
        
}
