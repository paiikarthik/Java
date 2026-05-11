//print till given number

import java.util.Scanner;


class Fibo1{
        int n;


        Fibo1(int n)
           {
               this.n=n;
            }

   void calFib()
      {
          int a=0;
          int b=1;
          int c=0;
          System.out.print(a+" "+b);
         while(c<n)
          { 
              c=a+b;
              if(c>n) break;
              System.out.print(" "+c);
              a=b;
              b=c;
          }
           
      }

  public void display()
  {

      System.out.println("First "+n+" Fibonacci Series is:");
      calFib();
   }
}

class Fibo11{
   public static void main(String[] args)

      {
          System.out.println("Enter the Number:");
          Scanner sc= new Scanner(System.in);
           int n=sc.nextInt();

          Fibo1 f= new Fibo1(n);
          f.display();
     }
}



             


     
