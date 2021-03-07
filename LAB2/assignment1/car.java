/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author BOSS
 */
public class car {
    String name;
    int model;
    String colour;
    String type;
    int number;
    public void comapny(){
        System.out.println("company name:   "+name+"\n type of vehicle:    "+type+"\n model of car:   "+model);    }
        public void parts(){   
            if(type=="LHV"){
                System.out.println("parts are available");
            }else
                System.out.println("parts are not available");
        }
    
    
}
