/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_activity_2;

/**
 *
 * @author cui
 */
public class ConstructRunner {
    public static void main(String[]args){
        Construct c1= new Construct();
        Construct c2= new Construct(3,4);
        c1.result();
        c2.result();
    }
    
}
