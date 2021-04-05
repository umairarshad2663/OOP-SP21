/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import static Assignment.Caculator.div;
import static Assignment.Caculator.mod;
import static Assignment.Caculator.multi;
import static java.lang.Double.sum;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;

/**
 *
 * @author Majid
 */
public class CalculatorRunner {
       public static void main(String args[]){
        System.out.println("Sum of number is: "+ sum(1,2));
        System.out.println("multiplication of numbers is: "+ multi(2,3));
        System.out.println("diviion of numbers  is: "+ div(4,2));
        System.out.println("Remainder is: "+ mod(15,5));
        System.out.println("Sine of the given angle i: "+ sin(90));
        System.out.println("cos of given angle is: "+ cos(60));
        System.out.println("tan of given angle is: "+ tan(30));
        
        
    }
}