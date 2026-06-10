/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

class EmpNoGenerator
{
	static int emplId;
	static
	{
		emplId=0;
	}
	static int getEmpNo()
	{
		return ++emplId;
	}
}
class Employee{
   private int empId;
   String empName, designation, org;
   float salary;
   
   
   Employee(int emplId,String empName, String designation, String org, float salary){
       this.empName=empName;
       this.designation=designation;
       this.org=org;
       empId=emplId;
       this.salary=salary;
   }
   
   void  displayEmployeeDetails(){
       System.out.println("Employee id:"+empId);
       System.out.println("Employee Name:"+empName);
       System.out.println("Employee designation:"+designation);
       System.out.println("Employee organiztion:"+org);
       System.out.println("Employee salary:"+salary);
   }
    
    
}

public class EmployeeMain {
      public static void main(String[] main)
      {
          Employee [] arr= new Employee[3];
          Scanner sc= new Scanner(System.in);
          for(int i=0;i<arr.length;i++)
          {
             
              
              System.out.println("Enter Employee Name:");
              String empName=sc.next();
              
              System.out.println("Enter Employee Salary:");
              float sal=sc.nextFloat();
              
              System.out.println("Enter Employee Designation:");
              String desig=sc.next();
              
              
              System.out.println("Enter Employee Organization:");
              String org=sc.next();
                 arr[i] = new Employee(EmpNoGenerator.getEmpNo(),empName, desig, org,sal);
              }
              
              for(int i=0;i<arr.length;i++)
			arr[i].displayEmployeeDetails();

              
              
          }
      }     

