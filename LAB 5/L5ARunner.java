/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;


public class L5ARunner {
     public static void main(String[] args) {
        
        Fraction f = new Fraction(5,2);
        f.display();
        if(f.equals(1.2)){
            System.out.println("Both fractions are equal");
            
        }
        else
            System.out.println("Both fractions are different");
        
        System.out.println("Fraction of two integers is :" + f.get());
    }
    
}

