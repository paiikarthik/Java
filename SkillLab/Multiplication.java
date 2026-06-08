package SKillLab;

class Multi{
	int num;
	
	Multi(int num){
		this.num=num;
	}
	
	void FindFact() {
		
		for(int i=1;i<=10;i++) 
		{
		   System.out.println(num+" x "+i+"="+num*i);
		}
		;
	}
	
	void display() {
		FindFact();
	}
}


public class Multiplication {
	public static void main(String[] args) {
		 
		  int n1=2;
		  Multi ob1= new Multi(n1);
		  ob1.display();
	 }

}
