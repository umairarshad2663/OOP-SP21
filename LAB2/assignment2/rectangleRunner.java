/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
import java.util.Scanner;
/**
 *
 * @author BOSS
 */
public class rectangleRunner {
   public static void main(String[]args){
       rectangle r1 = new rectangle();
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the height: ");
       r1.height= input.nextInt();
       System.out.println("Enter the width: ");
       r1.width= input.nextInt();
       r1.area();
       r1.perimeter();
   }
    
}
