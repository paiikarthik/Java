package Day3Pack;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee []arr  = new Employee[100];
		int count=0;
		Scanner sc = new Scanner(System.in);
		int choice;
		String str;
		do
		{
			System.out.println("1:Add Employee 2:Display Employee 3:Search By Designattion 4:Search By ID 5:Exit");
			System.out.println("Enter your choice:");
			choice= sc.nextInt();
			switch(choice)
			{
			case 1: 
				if(count<arr.length)
				{
					System.out.println("Enter the name");
					String name = sc.next();
					System.out.println("Enter the Salary:");
					double sal = sc.nextDouble();
					
					System.out.println("Enter the Designation:");
					String desig = sc.next(); 
			        System.out.println("Enter the Organization Name:");
			        String org=sc.next();
					arr[count] = new Employee(empIDGenerator.getID(),name , sal, desig,org);
					count++;
				}
				else
					System.out.println("No more employees can be added");
				break;
				
			case 2:
				if(count==0)
					System.out.println("Employee records are not yet available");
				else
					for(int i=0;i<count;i++)
					   arr[i].dispEmpDetails();
				break;
				
			case 3:
				if(count==0)
					System.out.println("Employee records are not yet available");
				else
				{
					System.out.println("enter the designation");
					String desig = sc.next();
					Employee.searchEmpRecord(desig, arr);
				}
				break;
			case 4:
				if(count==0)
					System.out.println("Emp records are not yet available");
				else
				{
					System.out.println("enter the id");
					int id = sc.nextInt();
					Employee.searchEmpRecord(id, arr);
				}
				break;
			case 5:
				System.out.println("Exiting....");
				System.exit(0);
				
			default:
				System.out.println("Invalid choice");
				break;
				
			}
		
		}while(true);
		
	}

}








