package SKillLab;

import java.util.Scanner;

class Number{
	int num;
	Number(int num){
		this.num=num;
	}
	
	void calculate() {
		if(num%2==0)
			 System.out.println(num+" is Even Number");
		else
			 System.out.println(num+" is Odd Number ");
	}
	
	void display() {
		calculate();
	}
}


public class EvenOdd {
	public static void main(String[] args)
	{
	
		System.out.println("Enter a Number:");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		Number n1= new Number(n);
		n1.display();
				
		
		
	
	}
}
