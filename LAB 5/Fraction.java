/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author Maliks
 */
public class Fraction {
    private int i1;
    private int i2;
    
    Fraction(){
        i1 = 2;
        i2 = 2;
        
    }
    
    Fraction(int i1, int i2){
        
        this.i1 = i1;
        this.i2 = i2;
        
    }
    
    public void set(int i1, int i2){
        this.i1 = i1;
        this.i2 = i2;
    }
    public double get(){
        return (double) i1/(double) i2;
    }
    public void display(){
        System.out.println("The ratio of two integers is: "+ (double)i1/(double)i2);
    }
    
    public boolean equals(double fraction){
        double fract1;
        fract1 = i1/i2;
        return fract1 == fraction;
        
        
    }
}
