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
public class CamisaFactory {

    public static Camisa getCamiseta(Tipos tipo, String talla,String color,String estampado){
        Camisa h = null ;
        switch (tipo){
            case Manga_Larga :   h = new CamisaMangaCorta(talla,color,estampado); break;
            case Manga_Corta :   h = new CamisaMangaLarga(talla,color,estampado); break;            
        }
        return h;
    }
    /*
    // implementacion de metodo que devuelve una instancia de un helado usando OCP
    // que depende de la ubicación de los objetos que se desean crear.
    public static Camisa getCamisa(Tipos tipo, String talla,String color,String estampado){
        Camisa h = null ;
        try {
            //recupera el paquete donde se encuentra la clase base
            String paquete = Helado.class.getPackage().getName();
            
            String laInstancia = paquete+".Helado"+tipo.name();
             
            h = (Helado) Class.forName(laInstancia).newInstance();
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
           h = null;
        }
        return h;
    }
*/
    
    
    
}
