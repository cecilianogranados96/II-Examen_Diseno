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
public class main {
        
    
        
    public static void main(String[] args) {

        
        
        
        String ciudad           = "SJO";
        String pais             = "CR";
        String codigo_postal    = "10601";
        String linea1           = "Aserri";
        String linea2           = "Aserri";
        
        
        String nombre           = "JOSE";
        String apellido         = "Ceciliano";
        int edad                = 12;
        String password         = "jose123";
        
        
  



                
        Direccion address = new Direccion (linea1, linea2, pais,ciudad, codigo_postal);
        Info_Usuario newUserInfo = new Info_Usuario(nombre, apellido, address, edad, password);

        Validar_Edad validar_Edad = new Validar_Edad();
        Validar_Direccion validar_Direccion = new Validar_Direccion();
        Validar_Nombre validar_nombre = new Validar_Nombre();
        Validar_Password validar_Password = new Validar_Password();
        
          
        List<String> errores_direccion = validar_Direccion.validar(newUserInfo);
        List<String> errores_edad = validar_Edad.validar(newUserInfo);
        List<String> errores_nombre = validar_nombre.validar(newUserInfo);        
        List<String> errores_password = validar_Password.validar(newUserInfo);
    
        System.out.println(errores_direccion);
        System.out.println(errores_edad);
        System.out.println(errores_nombre);
        System.out.println(errores_password);
        
    }
    

}
