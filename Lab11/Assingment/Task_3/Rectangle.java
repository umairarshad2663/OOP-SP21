package Assingment.Task_3;

public class Rectangle extends GeometricShape{
    
     private double length;
    private double width;
    
    public Rectangle(double length, double width){
        
        this.length = length;
        this.width = width;
        
    }
    
    public double area(){
        
        return length*width;
    }
    
}
