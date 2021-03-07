/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_activity_3;

import java.util.Scanner;

/**
 *
 * @author BOSS
 */
public class CarRunner {
    public static void main(String[]args)
{
Car car1=new Car ();
Scanner scan= new Scanner(System.in);
    System.out.println("enter modelno of car");
    String x = scan.nextLine();
    System.out.println("enter part no of the car");
    String y = scan.nextLine(); 
    System.out.println("enter cost of car  :");
    String z = scan.nextLine();
car1.setparameter(x,y,z);
car1.display();
}
    
}
