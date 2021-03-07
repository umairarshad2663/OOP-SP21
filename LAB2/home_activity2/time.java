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
public class time {
    int hours;
    int min;
    int sec;
    public void ShowTime(){
        System.out.println("time in hours"+hours+"\n in minutes is"+min+"\n in seconds is"+sec);
}
    public void converter(){
        double min_sec=min*60;
        double hou_sec=hours*3600;
        System.out.println("min in sec are "+min_sec);
        System.out.println("hours in sec are"+hou_sec);
        System.out.println(min_sec+hou_sec);
    }
    
}
