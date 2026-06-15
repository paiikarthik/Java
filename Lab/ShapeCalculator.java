import java.util.Scanner;

interface CircleShape {
    double areaCircle();
    double cirCircle();
}

interface Recta{
   double areaRect();
   double cirRect();
}

interface Trian{
  double areaTri();
  double cirTri();
}

interface Line{
    double calculate(byte m, byte x, byte z);
}


class  areaCalculator  implements CircleShape, Recta, Trian{

    byte r, l, b, a, bb, c,m,x,z;

    areaCalculator(byte r, byte l, byte b, byte a, byte bb, byte c, byte m, byte x, byte z) {
        this.r = r;
        this.l = l;
        this.b = b;
        this.a = a;
        this.bb = bb;
        this.c = c;
         this.m=m;
        this.x=x;
	this.z=z;
    }
 
   public double areaCircle(){
        return (22/7.0*r*r);
    }
      
   public double cirCircle(){
       return (2*22/7.0*r);
    }
    
  public   void displayCircle(){
        System.out.println("Area of a Circle is:"+areaCircle());
        System.out.println("Circumference of cirlce:"+cirCircle());
    }

    
   public double areaRect(){
        return l*b;
    }
    
    
  public  double cirRect(){
       return 2*(l+b);
    }
    
   public void displayRect(){
        System.out.println("Area of a Rectangle is:"+areaRect());
        System.out.println("Circumference of Rectangle:"+cirRect());
    }

    
public    double areaTri(){
        int s=(a+bb+c)/2;
        return (Math.sqrt(s*(s-a)*(s-bb)*(s-c)));
    }
    
    
  public  double cirTri(){
       return a+bb+c;
    }

    
   public  void displayTri(){
        System.out.println("Area of a Triangle is:"+areaTri());
        System.out.println("Circumference of Triangle:"+cirTri());
    }

public double LineEquation(){
int y;
  return y=m*x+z;

}

public void displayLine(){
       System.out.println("Y Intercept is:"+LineEquation());
}
}


public class ShapeCalculator {
       public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the Radius of Circle");
            byte r=sc.nextByte();


    
            System.out.println("Enter the Length of Rectangle");
            byte l=sc.nextByte();
            System.out.println("Enter the Breadth of Rectangle");
            byte b=sc.nextByte();


            System.out.println("Enter the length of a for Triangle");
            byte a=sc.nextByte();

           System.out.println("Enter the length of b of Triangle");
            byte bb=sc.nextByte();

            System.out.println("Enter the length of c of Triangle");
            byte c=sc.nextByte();


             System.out.println("Enter the Slope of Line(m)");
             byte m=sc.nextByte();
   
             System.out.println("Enter the horizontal coordinate of Line(x)");
            byte x=sc.nextByte();


             System.out.println("Enter  c of Line(c)");
             byte z=sc.nextByte();


            
           areaCalculator shp = new areaCalculator(r,l,b,a,bb,c,m,x,z);
           shp.displayCircle();
           shp.displayRect();
           shp.displayTri();
          shp.displayLine();

    }

}
