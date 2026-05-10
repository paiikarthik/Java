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
       return (2*22/7.0*radius);
    }
    
    void display(){
        System.out.println("Area of a Circle is:"+areaCircle());
        System.out.println("Circumference of cirlce:"+cirCircle());
    }
}


class Rectangle{
    
    byte l,b;
    Rectangle(byte l,byte b)
    {
        this.l=l;
        this.b=b;
    }
    
    double areaRect(){
        return l*b;
    }
    
    
    double cirRect(){
       return 2*(l+b);
    }
    
    void display(){
        System.out.println("Area of a Rectangle is:"+areaRect());
        System.out.println("Circumference of Rectangle:"+cirRect());
    }
}



class Triangle{
    
    byte a,b,c;
    Triangle(byte a,byte b, byte c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    double areaTri(){
        int s=(a+b+c)/2;
        return (Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
    
    
    double cirTri(){
       return a+b+c;
    }
    
    void display(){
        System.out.println("Area of a Triangle is:"+areaTri());
        System.out.println("Circumference of Triangle:"+cirTri());
    }
}




public class ShapeMain {
    public static void main(String[] args) {

        byte r = Byte.parseByte(args[0]);
        byte l = Byte.parseByte(args[1]);
        byte b = Byte.parseByte(args[2]);
        
        byte a=Byte.parseByte(args[3]);
        byte bb=Byte.parseByte(args[4]);
        byte c=Byte.parseByte(args[5]);

        Circle cir = new Circle(r);
        cir.display();

        Rectangle rect = new Rectangle(l, b);
        rect.display();
        
        Triangle tri=new Triangle(a,bb,c);
        tri.display();
    }
}
