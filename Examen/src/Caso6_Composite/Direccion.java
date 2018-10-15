/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso6_Composite;

/**
 *
 * @author Jose
 */
public class Direccion {
    private String linea1;
    private String linea2;
    private String pais;
    private String ciudad;
    private String codigo_postal;

    public Direccion(String linea1, String linea2, String pais, String ciudad, String codigo_postal) {
        this.linea1 = linea1;
        this.linea2 = linea2;
        this.pais = pais;
        this.ciudad = ciudad;
        this.codigo_postal = codigo_postal;
    }

    public String getLinea1() {
        return linea1;
    }

    public void setLinea1(String linea1) {
        this.linea1 = linea1;
    }

    public String getLinea2() {
        return linea2;
    }

    public void setLinea2(String linea2) {
        this.linea2 = linea2;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }
    
    
    
}
