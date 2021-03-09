/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_activity_3;

/**
 *
 * @author BOSS
 */
public class StudentRunner {
    public static void main(String[]args){
    int x[] = {10,20,30,40,50};
    int y[] = {30,20,80,60,40};
     
    Student s= new Student("Umair",x);
    int avg1 = s.avg();
    Student s1= new Student("muneeb",y);
    int agv2 = s1.avg();
    if (avg1>agv2){
        System.out.println("student 1 has greater average");
    }
    else{
        System.out.println("student 2 has greater average");
        
    }
    }
    
}
