/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_activity_2;


public class Construct {
    int length,width,result;
    public Construct(){
       length=10; width=22;
    }
    public Construct(int l,int w){
    length=l;width=w;
}
    public void result(){
        result=length*width;
        System.out.println("result is"+result);
    }
   
   
}
