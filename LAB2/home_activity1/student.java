/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_activity1;

/**
 *
 * @author BOSS
 */
public class student {
    String name;
    int rollno;
    float gpa;
    String degree;
    String book;
    int time;
    public void result(){
        System.out.println("Name:   "+name+"\n Roll no: "+rollno+"\n your GPA is:   "+gpa);
    }
     public void library(){
         System.out.println("Name:  "+name+"\n Roll no: "+rollno+"\n name of book:  "+book+"\n valid time in hours: "+time);
     }
}
