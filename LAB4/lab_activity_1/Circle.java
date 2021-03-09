/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_activity_1;

public class Circle {
    private int radius;
     public Circle(){ 
         radius=7;
         
     }
     public Circle(int r){
         radius=r;
     }
     public void setRadius(int r){
         radius=r;  
     }
     public int getRadius(){
         return radius;
         
     }
     public void result(){
         System.out.println("radius is"+radius);
         double c=2*3.1416*radius;
         System.out.println("circumference of circle is "+c);
         
     }
    
}
