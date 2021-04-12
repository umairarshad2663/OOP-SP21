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
public class Pizza {
    private String size;
private int CheeseTopping;
private int PepperoniTopping;
private int HamTopping;
public  int costS=10;
public  int costM=12;
public  int costL=14;
public Pizza(){
     
 }
public Pizza(String S, int ChT, int PepT, int HmT){
    size =  S;
    CheeseTopping = ChT;
    PepperoniTopping = PepT;
    HamTopping = HmT;
}

  
    public void  setsize(String S){
         size =  S;
}
    public void setCheeseTopping( int ChT){
        CheeseTopping = ChT;
    }
    public void setPepperoniTopping(int PepT){
        PepperoniTopping = PepT;
    }
    public void setHamTopping(int HmT){
          HamTopping = HmT;      
    }
    public String getsize(){
        return size;
    }
    public int getCheeseTopping(){
        return CheeseTopping;
    }
    public int getPepperoniTopping(){
        return PepperoniTopping;
    }
    public int getHamTopping(){
        return HamTopping;
    }
    public double calCost(){
        if(size=="small"){
            return costS+((2*CheeseTopping)+(2*PepperoniTopping)+(2*HamTopping));
        }else if (size=="medium"){
            return costM+((2*CheeseTopping)+(2*PepperoniTopping)+(2*HamTopping)) ;
        
        }else if(size=="large"){
            return costL+((2*CheeseTopping)+(2*PepperoniTopping)+(2*HamTopping));
        }else
             return 0;
        
        
    

}


}
