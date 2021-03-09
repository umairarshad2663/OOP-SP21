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
public class Mark {
    private int a,b,c;
    

public Mark(){
    a=5;
    b=10;
    c=13;
}
public Mark(int x, int y, int z){
    x=a;
    y=b;
    z=c;
}
public void setx(int x){
    a=x;
    
}
public void sety(int y){
    b=y;
    
}
public void setz(int z){
    c=z;
    
}
public int geta(){
    return a;
}
public int getb(){
    return b;
}
public int getc(){
    return c;
}
public void display(){
    System.out.println("three numbers are :"+a+" , "+b+ " and "+c);
}
}