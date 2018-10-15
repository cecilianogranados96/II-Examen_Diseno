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
 
        
        Direccion address         = new Direccion (linea1, linea2, pais,ciudad, codigo_postal);
        Info_Usuario info_usuario = new Info_Usuario(nombre, apellido, address, edad, password);
  
         
        List<Validar> lista = new ArrayList<Validar>();

        lista.add(new Validar_Edad());
        lista.add(new Validar_Direccion());
        lista.add(new Validar_Nombre());
        lista.add(new Validar_Password());
        
        
        Composite_Validar composite_Validar= new Composite_Validar(lista);
        
        List<String> errores = composite_Validar.validar(info_usuario);
        
        System.out.println(errores);

      
    }
    

}
