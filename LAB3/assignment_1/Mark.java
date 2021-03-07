/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_1;

public class Mark {
    int a;
    int b;
    int c;
    public Mark(){
        a=10;
        b=20;
        c=30; 
    }
    
    public Mark(int x, int y, int z){
        a=x;
        b=y;
        c=z;
        
    }
    public void result(){
       int sum=a+b+c;
        System.out.println("sum of numbers is "+sum);
    } 
}
    

