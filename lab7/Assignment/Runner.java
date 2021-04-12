/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umair;

/**
 *
 * @author tahir
 */
public class Runner {
    public static void main(String args[]){
        Pizza p1 = new Pizza();
        p1.setsize("medium");
        p1.setCheeseTopping(2);
        p1.setHamTopping(1);
        p1.setPepperoniTopping(2);
        
        Pizza p2 = new Pizza();
        p2.setsize("small");
        p2.setCheeseTopping(3);
        p2.setHamTopping(2);
        p2.setPepperoniTopping(3);
        
        PizzaOrder order=new PizzaOrder(p1);
        order.setP2(p2);
        System.out.println(order.calcTotal() );
    }   

}
