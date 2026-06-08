package SKillLab;

class Largest{
	
	int num1, num2, num3;
	 void setVars(int a, int b, int c) {
		
		num1=a;
		num2=b;
		num3=c;
	}
	
	void lar() 
	{
		 if(num1>num2) {
	    	 if (num1>num3) {
	    		 System.out.println("a is Greater");
	    	 }else {
	    		 System.out.println("C is Greater");
	    	 }
	     }
	    	 else
	    	 {
	    		  if(num2>num3) {
	    			  System.out.println("b is Greater");
	    		  } else
	    		  {
	    			  System.out.println("c is Greater");
	    		  }
	    	 }
		
	}
	
	
	void display() {
		lar();
	}
}


public class largestNumber {
	public static void main(String[] args)
	{
     int a=10;
     int b=23;
     int c=8;
     Largest ob1= new Largest();
     ob1.setVars(a, b,c);
     ob1.display();
     
    		 
    
}
}
