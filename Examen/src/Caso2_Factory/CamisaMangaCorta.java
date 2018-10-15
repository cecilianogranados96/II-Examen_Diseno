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
public class CamisaMangaCorta extends Camisa{

    public CamisaMangaCorta() {
        super(null, null,null,null);
    }
    
    public CamisaMangaCorta(String talla,String color,String estampado) {
        super(Tipos.Manga_Corta,talla,color,estampado);
    }

    @Override
    public String toString() {
        return "Camisa Manga Corta {" + super.toString() + "\n" ;
    }
        
}