/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.javaa;

class Circle{
    
    byte radius;
    Circle(byte radius)
    {
        this.radius=radius;
    }
    
    double areaCircle(){
        return (22/7.0*radius*radius);
    }
    
    
    double cirCircle(){
       return (2*22/7.0*radius*radius);
    }
    
    void display(){
        System.out.println("Area of a Circle is:"+areaCircle());
        System.out.println("Circumference of cirlce:"+cirCircle());
    }
}


public class ShapeMain {
    public static void main(String[] args)
    {
        byte r= Byte.parseByte(args[0]);
        
        Circle c= new Circle(r);
        c.display();
    }
}
