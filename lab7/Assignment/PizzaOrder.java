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
public class PizzaOrder {
    private Pizza p1;
    private Pizza p2;
    private Pizza p3;
    private double tCost;
    
    PizzaOrder(Pizza x1){
        p1=x1;
        
    }
    
    PizzaOrder(Pizza x1,Pizza x2){
        p1=x1;
        p2=x2;
        
    }
    
    PizzaOrder(Pizza x1,Pizza x2, Pizza x3){
        p1=x1;
        p2=x2;
        p3=x3;
    }
    
    public double calcTotal(){
        if(p3==null && p2 == null){
            tCost = p1.calCost();
        }else if(p3 == null){
            tCost = p1.calCost()+p2.calCost();
        }else{
            tCost = p1.calCost()+p2.calCost()+p3.calCost();
        }
        return tCost;
    }

    public void setP1(Pizza p1) {
        this.p1 = p1;
    }

    public void setP2(Pizza p2) {
        this.p2 = p2;
    }

    public void setP3(Pizza p3) {
        this.p3 = p3;
    }
    
}
