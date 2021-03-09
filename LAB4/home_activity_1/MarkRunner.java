/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_activity_1;

/**
 *
 * @author cui
 */
public class MarkRunner {
    public static void main (String[]args){
    Mark m1 = new Mark();
    m1.setx(1);
    m1.sety(2);
    m1.setz(3);
    m1.display();
    Mark m2 = new Mark();
     int q= m2.geta();
     int w= m2.getb();
     int e= m2.getc();
    m2.display();
    
    
    
    
}
}