package SKillLab;

import java.util.Scanner;

class Adding{
	
	int n1,n2;
	
	Adding(int n1,int n2){
		this.n1=n1;
		this.n2=n2;
	}
	
private int add()
	{
		 int sum= n1+n2;
		 return sum;
	}


void display() {
	System.out.println("Sum is:"+add());
}
}


public class AddTwo {
    public static void main(String[] args) {
    	System.out.println("Enter Number 1:");
    	Scanner sc = new Scanner(System.in);
    	int n1=sc.nextInt();
    	
    	System.out.println("Enter Number 2:");
    	int n2=sc.nextInt();
    	
    	Adding ob1=new Adding(n1,n2);
    	ob1.display();
    	
    }
}
