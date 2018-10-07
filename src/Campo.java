/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro
 */
import becker.robots.*;
import java.awt.Color;

public class Campo {
    private Caja[] caja = new Caja[7] ;
    private City ciudad;
    private Robot[] robot = new Robot[10];
    
    public Campo(){
        this.ciudad = new City();
        
        for (int i = 0 ; i < 11; i++) {
        this.robot[i] = new becker.robots.Robot(ciudad, 0, i, Direction.EAST);
        this.robot[i].setLabel("Robot" + i);
        this.robot[i].setColor(Color.BLUE);
        }
        
        int contadory = 0;
        int contadorNombre = 0;
        for(int i = 0; i < 4;i++ ){
            int contadorx = 0;
          for(int j = 0; j < 5; j++){
               Thing thing = new Thing(ciudad, contadorx,12+ contadory);
               thing.getIcon().setColor(Color.PINK);
               thing.getIcon().setLabel("Estante "+contadorNombre);
               contadorx +=2;
               contadorNombre++;
          }contadory +=2; 
        }
        
        for (int i = 0; i < 21; i++) {
             Wall pared = new Wall(ciudad, 0, i, Direction.NORTH);
        }
        
        for (int i = 0; i < 10; i++) {
             Wall pared = new Wall(ciudad, i, 20, Direction.EAST);
        }
        
         for (int i = 0; i < 21; i++) {
             Wall pared = new Wall(ciudad,9 , 20-i, Direction.SOUTH);
        }
       
  }
    
     public void moverAdelante(){
        for (int i = 0; i < 10; i++) { 
                   robot[i].move();
                        
                    }
     }
        
    }
       
            
        
        



