package Day3Pack;



import java.util.Scanner;

class empIDGenerator
{
	static int id;
	static
	{
		id=0;
	}
	static int getID()
	{
		return ++id;
	}
}


class Employee
{
	int empID;
	String empName;
	double empSal;
	String empDesig;
	String org;
	
	
	public Employee(int empID, String empName, double empSal, String empDesig, String org) {
		
		this.empID = empID;
		this.empName = empName;
		this.empSal = empSal;
		this.empDesig = empDesig;
		this.org=org;
	}


	void dispEmpDetails()
	{
		System.out.println("Employee Id: "+empID);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Salary: "+empSal);
		System.out.println("Employee Designation: "+empDesig);
		System.out.println("Employee Organization: "+org);
	}
	
	
	
	static void searchEmpRecord(String desig,Employee []arr)
	{ 
		boolean status=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=null)
			{
				if(arr[i].empDesig.equals(desig))
				{
					status=true;
					arr[i].dispEmpDetails();
				}
			}
		}
		if(status==false)
			System.out.println("No Employee Records in that Designation");
		
	}
	static void searchEmpRecord(int id,Employee [] arr)
	{
		boolean status=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=null)
			{
				if(arr[i].empID==id)
				{
					status=true;
					arr[i].dispEmpDetails();
				}
			}
		}
		if(status==false)
			System.out.println("No Employee Record Found in this ID");
		
	}	
	
}






