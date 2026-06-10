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
   
  static void searchEmpRecord(String desig, Employee []arr)
   {
       boolean status=false;
       for(int i=0;i<arr.length;i++){
           if(arr[i]!=null){
               if (arr[i].designation.equals(desig)){
                   status=true;
                   arr[i].displayEmployeeDetails();
                           
               }
               
           }
       }
       
       if(status=false)
           System.out.println("No emp records in thAT DESIGNATION");
   }
    
   static   void searchEmpID(int ID, Employee []arr)
   {
       boolean status=false;
       for(int i=0;i<arr.length;i++){
           if(arr[i]!=null){
               if(arr[i].empId==ID){
                   status=true;
                   arr[i].displayEmployeeDetails();
                           
               }
               
           }
       }
       
       if(status=false)
           System.out.println("No emp records in that ID");
   }
    
}

public class EmployeeMain {
      public static void main(String[] main)
      {
          Employee [] arr= new Employee[3];
          Scanner sc= new Scanner(System.in);
          int count=0;
          int choice;
          do{
              System.out.println("1: Add Emp 2: Dis Emp 3:Search BY Designation 4:SearchBYID");
              System.out.println("Enter Your Choice:");
              choice=sc.nextInt();
              switch(choice){
                  case 1:
                      if (count<arr.length)
                      {
                            System.out.println("Enter Employee Name:");
                            String empName=sc.next();
              
                            System.out.println("Enter Employee Salary:");
                            float sal=sc.nextFloat();
              
                            System.out.println("Enter Employee Designation:");
                            String desig=sc.next();
              
              
                            System.out.println("Enter Employee Organization:");
                            String org=sc.next();
                            arr[count] = new Employee(EmpNoGenerator.getEmpNo(),empName, desig, org,sal);
                            count++;
                          
                      }else{
                          System.out.println("No More Employees can be added");
                      } break;
                  case 2:
                      for(int i=0;i<count;i++)
			 arr[i].displayEmployeeDetails();
			break;
                       
                  case 3:
                      System.out.println("Enter Employee designation");
                      String desig = sc.next();
		      Employee.searchEmpRecord(desig, arr);
                      break;
                  case 4:
                      System.out.println("Enter Employee id");
			 int id = sc.nextInt();
		      Employee.searchEmpID(id, arr);
                       break;
               
                  default:
                      System.out.println("Invalid Choice");
                       break;
              
              }
          }while(true);
      }   
         
      }     

