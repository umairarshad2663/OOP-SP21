/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2;

import java.util.Scanner;

public class TimeRunner {
      public static void main(String args[]){
        int hr ,min ,sec;
        Time1 h = new Time1();
        h.result();
    
          System.out.println("enter 1 to enter time or 2 to exit");
          Scanner s1=new Scanner(System.in);
        int choice = s1.nextInt();
        if(choice==1){
            Scanner s=new Scanner(System.in);
            System.out.println("Enter Hours: ");
            hr=s.nextInt();
            System.out.println("Enter Minutes: ");
            min=s.nextInt();
            System.out.println("Enter Seconds: ");
            sec=s.nextInt();
            if(hr>24 || min>60 || sec>60){
                System.out.println("Time format is invalid.");
                System.exit(0);
            }
            Time1 h2 = new Time1(hr,min,sec);
            h2.result();
            
        }else{
            System.exit(0);
             }
      }
}
        
          
        
        
    
    
    
    
    

