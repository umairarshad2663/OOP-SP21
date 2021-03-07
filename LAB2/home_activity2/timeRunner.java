/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_activity2;

/**
 *
 * @author BOSS
 */
public class timeRunner {
    public static void main(String[]args){
        time t1=new time();
         time t2=new time();
         t1.hours=3;
         t1.min=34;
         t1.sec=59;
          t2.hours=3;
         t2.min=34;
         t2.sec=59;
         t1.ShowTime();
         t2.converter();
    }
    
}
