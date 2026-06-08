package SKillLab;

class CheckNum{
	int num;
	
	CheckNum(int num){
		this.num=num;
	}
	
	void NumFind() {
		if (num==0) {
			
			 System.out.println("Given Number "+num +" is Zero");
			
		} else if (num>1) {
			 System.out.println("Given Number "+num+" is +ve");
		}
		else {
		  System.out.println("Given Number "+num+" is Negative");
		}
	}
	
	void display() {
		NumFind();
	}
}


public class NumCheck {
	 public static void main(String[] args) {
	 
		  int n1=10;
		  int n2=0;
		  int n3=-1;
		  
		  CheckNum ob1= new CheckNum(n1);
		  CheckNum ob2= new CheckNum(n2);
		  CheckNum ob3= new CheckNum(n3);
		  
		  ob1.display();
		  ob2.display();
		  ob3.display();
	 }
}
