/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author BOSS
 */
public class rectangle {
     int height, width,area,perimeter;
    public void area(){
        area = height*width;
        System.out.println("Area: "+area);
    }public void perimeter(){
        perimeter = 2*(height+width);
    }
    
}
