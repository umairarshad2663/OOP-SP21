/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_home_activity_1;

public class circle {
    int circum,radius;
    public  circle(){
       circum=10; radius=22;
    }
    public circle(int c,int r){
    circum=c;radius=r;
}
    public void result(){
        double pi=3.1416;
        double  result=pi*radius;
        System.out.println("area of circle is"+result);
        int dia=radius*2;
        System.out.println("diameter of circle is"+dia);
    }
    
}
