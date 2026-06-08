
package Day1;
import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {
		int n1,n2,choice;
		System.out.println("Enter 2 Integer");
		Scanner sc= new Scanner(System.in);
		 n1=sc.nextInt();
		 n2=sc.nextInt();	
		 System.out.println("1. Add 2.Sub 3.Multi 4. Sub");
		 choice=sc.nextInt();
		 
		 switch(choice) {
		 case 1:
			 System.out.println("add "+(n1+n2));
			 break;
		 case 2:
			 System.out.println("Sub "+(n1-n2));
			 break;
		 case 3:
			 System.out.println("Multi "+(n1*n2));
			 break;
		 case 4:
			 System.out.println("Devide "+(n1/n2));
			 break;
			
		default: 
			System.out.println("Invlaid ");
		 }
	

	}

}
