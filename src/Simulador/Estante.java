/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simulador;

import becker.robots.City;
import becker.robots.Thing;

/**
 *
 * @author Alejandro
 */

public class Estante {
     private Caja[] caja = new Caja[3];
     private Thing estante;
     
    public Estante(City ciudad, int avenida, int calle) {
        this.estante = new Thing(ciudad,avenida,calle);
        for (int i = 0; i < 3; i++) {
            this.caja[i] = new Caja();
        }
    }

    public Caja[] getCaja() {
        return caja;
    }

    
    public void setCaja(Caja[] caja) {
        this.caja = caja;
    }

    public Thing getEstante() {
        return estante;
    }

    public void setEstante(Thing estante) {
        this.estante = estante;
    }
    
    public boolean revisarObjeto(String objeto){
        boolean  resultado = false;
        for (int i = 0; i < caja.length; i++) {
                if(caja[i].revisarEspacios().equals(objeto)){
                   resultado = true; 
                }
            }return resultado;
        }
    
    
    public boolean revisarVacio(){
        boolean resultado = false;
        for (int i = 0; i < caja.length; i++) {
            if(caja[i].revisarVacio()==true){
                resultado = true;
            }
        }return resultado;
    }
    
    
    
    /*public void saberCosas(){
        estante.
    }*/
  
     
}
