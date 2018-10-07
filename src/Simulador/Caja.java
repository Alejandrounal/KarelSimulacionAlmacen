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
public class Caja {
    private Espacio[] espacios = new Espacio[7];
    
    public Caja() {
        for (int i = 0; i < 7; i++) {
            this.espacios[i] = new Espacio(); 
        } 
    }
    
    public Espacio[] getEspacios() {
        return espacios;
    }

    public void setEspacios(Espacio[] espacios) {
        this.espacios = espacios;
    }
    
    public String revisarEspacios(){
        String resultado = null;
        for (int i = 0; i < espacios.length; i++) {
            if(espacios[i].getObjeto() != null){
                resultado =  espacios[i].getObjeto();
            }
        }return resultado;
    }
    
    public boolean revisarVacio(){
        boolean resultado = false;
        for (int i = 0; i < espacios.length; i++) {
            if(espacios[i].getObjeto() == null){
                resultado = true;
            }
        }return resultado;
    }
    
    
    
}
