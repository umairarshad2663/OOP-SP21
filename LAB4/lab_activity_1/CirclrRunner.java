/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_activity_1;


public class CirclrRunner {
     public static void main(String[] args) {
      Circle c = new Circle();
      c.setRadius(20);
      c.result();
      Circle c2 = new Circle();//using private value by using get method
         int r = c2.getRadius();
         double n = 2*3.1416*r;
         System.out.println("new circumference of circle is"+n);
    }
    
}
