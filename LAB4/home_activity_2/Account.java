/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_activity_2;

/**
 *
 * @author BOSS
 */
public class Account {
    private int balance;
    public Account(){
        balance =1000;
    }
    public Account(int b){
        balance = b;
    }
    public void setdeposit(int b){
       balance=balance + b;   
    }
    public void setwithdrwa(int a){
        balance=balance-a;
    }
    public void diplay(){
        System.out.println("The balance is" + balance);
               
        
    }
    
    
    
}
