/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_activity1;

import java.util.Scanner;

/**
 *
 * @author BOSS
 */
public class studentRunner {
    public static void main(String[]args){
    student s1 = new student();
     student s2 = new student();
     Scanner input = new Scanner(System.in);
        System.out.println("enter your name");
        s1.name=input.nextLine();
        System.out.println("enter your gpa");
        s1.gpa=input.nextFloat();
        s1.book="calculus";
        s1.degree="SE";
        System.out.println("enter your name");
        s2.name=input.next();
        System.out.println("enter your gpa");
        s2.gpa=input.nextFloat();
        s2.book="calculus";
        s2.degree="SE";
        s2.time=24;
s1.result();
s2.library();
          
    
    }
    
}
