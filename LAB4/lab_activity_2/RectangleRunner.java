/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_activity_2;

/**
 *
 * @author cui
 */
public class RectangleRunner {
     public static void main(String[] args) {
         Rectangle r= new Rectangle();
         r.setlength(2);
         r.setwidth(5);
         r.display();
          Rectangle r2= new Rectangle();
          int l1= r2.getlength();
          int w2=r2.getwidth();
          r2.display();
     }
}
