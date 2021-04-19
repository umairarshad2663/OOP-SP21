/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

public class RunnerComputer {
    public static void main(String []arg){
        Laptop hp1=new Laptop();
        hp1.Bits=4;
        hp1.MegaHertz=2;
        hp1.height=2;
        hp1.length=13;
        hp1.memoryMegaByte=4000;
        hp1.storageMegaByte=128000;
        hp1.weight=2;
        hp1.width=8;
        
        Laptop hp2=new Laptop(8, 17 , 3 , 3 ,8,12000, 256000, 3);
        System.out.println("computer 1.");
        hp1.Display();
        System.out.println("computer 2.");
        hp2.Display();
    }
}
