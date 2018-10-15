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
public abstract class Camisa {
         
    Tipos tipo;
    private String talla;
    private String color;
    private String estampado;

    public Camisa(Tipos tipo,String talla,String color,String estampado) {
        this.tipo = tipo;
        this.talla = talla;
        this.color = color;
        this.estampado = estampado;
    }

    @Override
    public String toString() {
        return "Camisa{" + "\tTipo=" + tipo + ", \tTalla=" + talla + ", \tColor=" + color + ",\t Estampado=" + estampado + "}";
    }
}
    