/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_activity_1;

import java.util.Scanner;

/**
 *
 * @author cui
 */
public class RectangleRunner2 {
    public static void main(String[]args){
        Rectangle2 r=new Rectangle2();
        Scanner input = new Scanner(System.in);
        System.out.println("enter length of rectangle");
        r.length=input.nextInt();
        System.out.println("enter length of rectangle");
        r.width=input.nextInt();  
        r.area();
    }
    
}
