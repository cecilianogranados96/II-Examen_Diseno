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

public class CamisaMangaLarga extends Camisa{

    public CamisaMangaLarga() {
        super(null, null,null,null);
    }
    
    public CamisaMangaLarga(String talla,String color,String estampado) {
        super(Tipos.Manga_Larga  ,talla,color,estampado);
    }

    @Override
    public String toString() {
        return "Camisa Manga Larga {" + super.toString() + "\n" ;
    }
        
}


