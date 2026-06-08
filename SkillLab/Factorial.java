package SKillLab;

class Fact{
	int num;
	
	Fact(int num){
		this.num=num;
	}
	
	int FindFact() {
		int fact=1;
		for(int i=1;i<=num;i++) 
		{
		   fact=fact*i;
		}
		return fact;
	}
	
	void display() {
		System.out.println(FindFact());
	}
}


public class Factorial {
	public static void main(String[] args) {
		 
		  int n1=5;
		  Fact ob1= new Fact(n1);
		  ob1.display();
	 }
}

