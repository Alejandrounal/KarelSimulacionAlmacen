/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simulador;

import becker.robots.*;
import java.awt.Color;

/**
 *
 * @author Alejandro
 */
public class Campo {
    private City ciudad;
    private Roboto[] robot = new Roboto[10];
    private Estante[] estantes = new Estante[20];

    public Campo() {
        this.ciudad = new City();
        
        int contadorSubr = 0;
        int contadoryr = 0;
        for(int j = 0; j < 10; j++){
            int contadorx = 0;
            for (int i = 0; i < 1; i++) {
            this.robot[contadorSubr] = new Roboto(ciudad,contadoryr,contadorx+9,Direction.EAST);
            this.robot[contadorSubr].getRobot().setLabel("Robot "+ contadorSubr);
            this.robot[contadorSubr].getRobot().setColor(Color.BLUE);
            contadorx +=1;
            contadorSubr +=1;     
        }contadoryr += 2;
        }
        
         int contadory = 0; // Creacion de estantes
         int contadorSub = 0;
         for(int i = 0; i < 10; i++){
             int contadorx = 0;
             for (int j = 0; j < 2; j++) {
                 this.estantes[contadorSub] = new Estante(ciudad,contadory,12+contadorx);
                 this.estantes[contadorSub].getEstante().getIcon().setColor(Color.PINK);
                 this.estantes[contadorSub].getEstante().getIcon().setLabel("Estante " + contadorSub);
                 contadorx +=2;
                 contadorSub++;
             }contadory +=2;
         }
       
         for (int i = 0; i < 21; i++) { // Crea muros arriba
             Wall pared = new Wall(ciudad, 0, i, Direction.NORTH);
        }
        
        for (int i = 0; i < 10; i++) { // Crea muros derecha
             Wall pared = new Wall(ciudad, i, 20, Direction.EAST);
        }
        
        /* for (int i = 0; i < 21; i++) { // Crea muros abajo
             Wall pared = new Wall(ciudad,9 , 20-i, Direction.SOUTH);
        }*/
         
             
    }     
          
    
     public void recorrerThings(int inicio,int indice, String objeto){
         while(robot[indice].getRobot().frontIsClear()==true){
             if (robot[indice].getRobot().canPickThing()==true){
                 if(estantes[inicio].revisarObjeto(objeto)==true && robot[indice].getRobot().countThingsInBackpack()==0){
                     robot[indice].getRobot().pickThing();
                 }else{
                    inicio++;
                    robot[indice].getRobot().move();
                 }
             }else{
                 robot[indice].moverAdelante();
             }
        }
    }

     public void revisarVacio(int inicio, int indice){
        while(robot[indice].getRobot().frontIsClear()==true){
            if(robot[indice].getRobot().canPickThing() == true){
                if(estantes[inicio].revisarVacio() == true && robot[indice].getRobot().countThingsInBackpack()==0){
                    robot[indice].getRobot().pickThing();
                }else{
                    inicio++;
                    robot[indice].getRobot().move();
                }
            }else{
                robot[indice].getRobot().move();
            }
        }
     }   
               
 }  
    


     
        


    
    
