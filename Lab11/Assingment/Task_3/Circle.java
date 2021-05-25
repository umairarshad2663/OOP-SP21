package Assingment.Task_3;

public class Circle extends GeometricShape{
    
    private double radius;
    
    public Circle(double radius){
        
        this.radius = radius;
    }
    
    public double area(){
        
        return 2*Math.PI*radius;
    }
    
}
