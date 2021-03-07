/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author BOSS
 */
public class carRunner {
    public static void main(String[]args){
        car c1=new car();
         car c2=new car();
         c1.model=2020;
         c1.type="LHV";
         c1.name="honda";
           Scanner input = new Scanner(System.in);
        //System.out.println("enter type of vehicle");
        //c2.type =input.next();
         c2.type="LHV";
         c1.comapny();
         c2.parts();
    }
    
}
