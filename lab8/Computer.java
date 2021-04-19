/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

public class Computer {
    int Bits;
int memoryMegaByte;
int storageMegaByte;
int MegaHertz;
public Computer(){
    this.Bits=4;
    this.storageMegaByte=250;
    this.memoryMegaByte=4;
    this.MegaHertz=4;
    }
public Computer(int wordSizeInBits,int memorySizeInMegaByte, int storageSizeInMegaByte, int speedInMegaHertz ){
this.Bits=wordSizeInBits;
this.memoryMegaByte=memorySizeInMegaByte;
this.storageMegaByte=storageSizeInMegaByte;
this.MegaHertz=speedInMegaHertz;
}

public void Display(){
    System.out.println("Word size in bits is: "+Bits+"\nmemory size in mega byte is: "+memoryMegaByte+ "\n Storage size in mega byte is: "+
           +storageMegaByte +"\n Storage size in mega byte is: " +MegaHertz);
}

    
}
