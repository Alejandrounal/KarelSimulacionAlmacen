/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simulador;

/**
 *
 * @author Alejandro
 */
public class Espacio {
    private String objeto;
    private float precio;

    
    public Espacio(String objeto, float precio) {
        this.objeto = objeto;
        this.precio = precio;
    }
    
    
    
    public Espacio() {
    }

    public String getObjeto() {
        return objeto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
