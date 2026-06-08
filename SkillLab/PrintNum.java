package SKillLab;


class NumPrint{
	int num;
	
	NumPrint(int num){
		this.num=num;
	}
	
	void Printing() {
		for(int i=0;i<=num;i++) {
			System.out.println(i);
		}
		
	}
	
	void display() {
		Printing();
	}
}


public class PrintNum {
	 public static void main(String[] args) 
	 {
			
		 int num=100;
		 NumPrint ob1 = new NumPrint(num);
		 ob1.display();
		
	 }
}
