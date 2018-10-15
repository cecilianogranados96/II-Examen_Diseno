/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso2_Factory;

/**
 *
 * @author Jose
 */
public class main {


    public static void main(String[] args) {
        CamisaFactory camisa = new CamisaFactory();
               
        Camisa para_jose = camisa.getCamiseta(Tipos.Manga_Larga,"M","AZUL","LOGO TEC");
        System.out.println(para_jose.toString());
        
        
        Camisa para_silvia = camisa.getCamiseta(Tipos.Manga_Corta,"S","ROSADO","LOGO TEC");
        System.out.println(para_silvia.toString());
        
        
        
        Camisa para_prof = camisa.getCamiseta(Tipos.Manga_Corta,"S","Blanco","LOGO TEC");
        System.out.println(para_prof.toString());
    }
}
