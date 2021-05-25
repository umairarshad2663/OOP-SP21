package Assingment.Task_2;

import Assingment.Task_3.Circle;
import Assingment.Task_3.Rectangle;
import Assingment.Task_3.Triangle;


public class L11As2RUNNER {

    public static void main(String[] args) {
       
        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 5.6);
        
        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
    
}
