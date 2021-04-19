/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.question2;

public class RunnerPublication {
    public static void main(String arg[]){
        book book1=new book(1200, "english", 500);
        book book2=new book(1300, "urdu", 600);
        book book3=new book(1400, "math", 700);
        
        tape tape1=new tape("poop", 500, 120);
        tape tape2=new tape("hiphop", 600, 130);
        tape tape3=new tape("romantic", 700, 140);
        
        System.out.println("book1\n");
        book1.display();
        System.out.println("book2\n");
        book2.display();
        System.out.println("book3\n");
        book3.display();
        
        System.out.println("tape1\n");
        tape1.display();
        System.out.println("tape2\n");
        tape2.display();
        System.out.println("tape3\n");
        tape3.display();
        
    }
}
