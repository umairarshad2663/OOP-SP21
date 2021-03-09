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
public class Rectangle {
    private int length,width;
    public Rectangle(){
        length=10;
        width=15;
    }
    public Rectangle(int l, int w ){
        length=l;
        width=w;
        
    }
     public void setwidth(int w ){
        width=w;
        
     }
       public void setlength(int l ){
        length=l;
        
     }
         public int getwidth(){
        return width;
        
     }
       public int getlength(){
        return length;
        
     }
       public void display(){
           
           double area=length*width;
           System.out.println("area of rectangle is:    "+area);
           
           
           
       }
     
      
        
        
   
    
    
}
