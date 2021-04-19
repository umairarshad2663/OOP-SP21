/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.question2;

public class tape extends publication{
    private int TimeInMinutes;  

    public tape(String title, int price, int timeInMinute) {
        super(title, price);
        TimeInMinutes=timeInMinute;
    }

    public int getTimeInMinutes() {
        return TimeInMinutes;
    }

   
    public void setTimeInMinutes(int TimeInMinutes) {
        this.TimeInMinutes = TimeInMinutes;
    }
    
    @Override
    public void display(){
    super.display();
        System.out.println("playing time in minutes is "+TimeInMinutes);
    }
}
