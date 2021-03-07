/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_home_activity_3;
public class distance {
    int feet, inches;

    public  distance(){
        feet= 5; inches=8;
    }
    public distance(int f, int i){
        feet=f;
        inches=i;
    }
    public void display(){
        System.out.println("YOUR HEIGHT IS "+feet+" ' "+inches);
    }
}
