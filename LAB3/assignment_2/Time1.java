/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2;

    public class Time1 {
    int hr;
    int min;
    int sec;
    public Time1(){
        hr=24;
        min=60;
        sec=60; 
    }
    
    public Time1(int x, int y, int z){
        hr=x;
        min=y;
        sec=z;
        
    }
    public void result(){
        
        System.out.println("Time is  "+hr+" hours   :"+min+" minutes   :"+sec+" seconds  ");
    } 
}
    

