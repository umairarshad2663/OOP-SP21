/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_activity_3;

/**
 *
 * @author cui
 */
public class CoordinatesRunner {
   

public static void main (String[]args){
    Coordinates P1= new Coordinates();   
P1.setX(10);
P1.setY(7);
P1.display();
    Coordinates p2 = new Coordinates(4,5);
p2.movePoint(3, 2);
p2.display();
}
}
