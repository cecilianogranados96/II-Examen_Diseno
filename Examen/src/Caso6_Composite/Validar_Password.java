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
public class Validar_Password implements Validar<Info_Usuario>  {

    @Override
    public List<String> validar(Info_Usuario info) {
        List<String> errores = new ArrayList();
        if (info.getPassword().isEmpty()) {
            errores.add("Password Vacio");
        }
        return errores;
    }
    
    
    
}
