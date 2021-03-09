/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_1;

/**
 *
 * @author BOSS
 */
public class HotDogStandRunner {
    public static void main(String[]args){
        HotDogStand h1 = new HotDogStand(2,5) ;
        h1.justSold();
        HotDogStand h2 = new HotDogStand(3,7);
        h2.justSold();
        HotDogStand h3 = new HotDogStand(4,8);
        h3.justSold();
        h3.justSold();
        h3.justSold();
       
        int x = h1.gettotal();
         System.out.println("total no of hot dogs  sold on stand numer"+h1.id+" today is: "+x);
        int y = h2.gettotal();
         System.out.println("total no of hot dogs  sold on stand numer"+h2.id+" today is: "+y);
        int z = h3.gettotal();
         System.out.println("total no of hot dogs  sold on stand numer"+h3.id+" today is: "+z);
    }
}
    

