package SKillLab;

class Two{
	int num1,num2;
	
	void setVars(int a, int b) {
		num1=a;
		num2=b;
	}
	
	void swapNum() {
		 System.out.println("Before Swaping Number 1"+num1);
		 System.out.println("Before Swaping Number 1"+num2);
		 num1=num1+num2;
		 num2=num1-num2;
	     num1=num1-num2;
		 
	     System.out.println("After Swaping Number 1"+num1);
	     System.out.println("After Swaping Number 1"+num2);
		
	}
	
	void display() {
		swapNum();

}
}

public class SwapTwo {
	 public static void main(String[] args) {
		 
		 int a=10;
		 int b=22;
		 
		 Two ob1= new Two();
		 ob1.setVars(a, b);
		 ob1.display();
		 
		 
		
	 }
}
