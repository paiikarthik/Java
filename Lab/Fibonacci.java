//print no 
import java.util.Scanner;


class Fib{
        int n;


        Fib(int n)
           {
               this.n=n;
            }

   void calFib()
      {
          int a=0;
          int b=1;
          System.out.print(a+" "+b);
          for(int i=2;i<=n;i++)
          { 
              int c=a+b;
              System.out.print(" "+c);
              a=b;
              b=c;
          }
            
      }

  void display()
  {

      System.out.println("Fibonacci Series is:");
   calFib();
   }
}

class Fibonacci{
   public static void main(String[] ars)

      {
          System.out.println("Enter the Number:");
          Scanner sc= new Scanner(System.in);
           int n=sc.nextInt();

            Fib f= new Fib(n);
            f.display();
     }
}



             


     
