package OrgPack;
import java.util.Scanner;


abstract class Employee{
	protected String empName;
	
	Employee(String empName){
		this.empName=empName;
	}
	
	public String getempName() {
		return empName;
	}
}



class PEmp extends Employee{
	
	public int getHra() {
		return hra;
	}

	int hra;
	
	PEmp(String empName, int hra){
		super(empName);
		this.hra=hra;
		
	}




	
	
}
class TEmp extends Employee{
	public int getDuration() {
		return duration;
	}
	
	int duration;
	TEmp(String empName, int duration){
		super(empName);
		this.duration=duration;
		
	}
	
	
}



class Organ
{
	Employee [] emp ;
	int empCount;
	Organ()
	{
		emp = new Employee[3];
		empCount=0;
	}
	
	void registerEmployee()
	{
		Scanner s = new Scanner(System.in);
		String empname;
		int choice;
		if(empCount<emp.length)
		{
			System.out.println("Enter the Employee Name:");
			empname=s.next();
			
			System.out.println("1:Temporary Employee 2:Permanent Employee");
			System.out.println("\n");
			System.out.println("Enter your the choice: ");
			choice = s.nextInt();
			if(choice==1)
				emp[empCount++]=new TEmp(empname,2);
			else if(choice==2)
				emp[empCount++]=new PEmp(empname,1000);
		}
		else
			System.out.println("No more registrations are allowed");
		    System.out.println("\n");
		
	}
	void dispEmpDetails()
	{
		int choice;
		System.out.println("1:Display All Employee Details\n 2: Display Permanent Employee \n 3. Display Temporary Employee");
		System.out.println("Enter your the choice");
		Scanner s = new Scanner(System.in);
		choice = s.nextInt();
	
		if(choice==1)
		{
		  if(empCount==0)
		   { System.out.println("no records found");}
		   else
		   {
			for(int i=0;i<empCount;i++)
			{
				
				System.out.println("Employee Details are:");
				System.out.println("Employee Name: "+emp[i].getempName());
	
				if(emp[i] instanceof PEmp)
				{
					System.out.println("Employee HRA: "+((PEmp)emp[i]).getHra());
					  System.out.println("\n");
				}
				  
				else if(emp[i] instanceof TEmp)
					System.out.println("Employee Duration: "+((TEmp)emp[i]).getDuration());
				  System.out.println("\n");
			}
				
		}
	}
		else if(choice==2) {
			 
			if(empCount==0)
				{System.out.println("no records found");}
			  else {
				for(int i=0;i<empCount;i++)
				{
				if(emp[i] instanceof PEmp)
				{
					System.out.println("Employee HRA: "+((PEmp)emp[i]).getHra());
					System.out.println("Employee Name: "+emp[i].getempName());
					System.out.println("\n");
				}
			}
				
				
			}
		}
			
			
		else if(choice==3)
		{
			if(empCount==0)
				{System.out.println("no records found");}
			else {
				for(int i=0;i<empCount;i++)
				{
					if(emp[i] instanceof TEmp)
						{System.out.println("Employee Name: "+emp[i].getempName());
						System.out.println("Employee Duration: "+((TEmp)emp[i]).getDuration());
					  System.out.println("\n");} 
			    } 
				
				
			}
		}
		
		else
		System.out.println("Invalid Option You Entered");
		}
	
}


public class Organization {
	public static void main(String[] args) {
		
    
        
        
		Organ inst = new Organ();
		inst.registerEmployee();
		inst.registerEmployee();
		inst.registerEmployee();
		inst.registerEmployee();
		
		inst.dispEmpDetails();
	}

}


