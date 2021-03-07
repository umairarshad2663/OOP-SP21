/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_activity_3;


public class Car {
    private String modelNumber;
private String partNumber;
private String cost;
public void setparameter(String x, String y,String z)
{
modelNumber=x;
partNumber=y;
cost=z;
}
public  void display()
{
    System.out.println("model no of car :"+modelNumber+"part no of the car :"+partNumber+"cost of car  :"+cost);
    
    
}
}

