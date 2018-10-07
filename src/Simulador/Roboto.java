/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simulador;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author Alejandro
 */
public class Roboto {
    private Robot robot;

    public Roboto(City ciudad, int avenida, int calle, Direction direccion) {
        this.robot = new Robot(ciudad, avenida, calle,direccion);
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }
    
    public void moverAdelante(){
        robot.move();
    }
    public void moverHastaObstaculo(){
        while(robot.frontIsClear())
            robot.move();
    }
    
    public void girarDerecha(){
        for (int i = 0; i < 2; i++) {
            robot.turnLeft();
        }
    }    
    
    public boolean revisarEstante(){
      if(robot.canPickThing() ==  true){
          return true;
      }else return false;
    }
    
    
    
    
}
