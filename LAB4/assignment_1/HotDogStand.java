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
public class HotDogStand {
    int id;
    private int num;
    public HotDogStand(int x, int y){
        id=x;
        num=y;
    }
    public void justSold(){
    num++;
        
    }
    public int  gettotal(){
       return num;
    }
    
}
