/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_activity_3;

/**
 *
 * @author BOSS
 */
public class Student {
    private String Name;
    private int Result_array[]= new int[5];
    private int sum=0,avg=0;

    
    public  Student(String n,int x[]){
        Name=n;
        for(int i=0;i<5;i++){
            Result_array[i]=x[i]; 
        }      
    }    
    public int avg(){
         for(int i=0;i<5;i++){
            sum =sum + Result_array[i];   
        }  
         avg=sum/5;
         return avg;
        
    }
             
        
}

