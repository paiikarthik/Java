package TreeExa;


import java.util.ArrayList;

import java.util.Scanner;
import java.util.TreeMap;
import OrgPack.Organization;
import Day3Pack.EmployeeMain;

abstract class Employee {
    protected String empName;

    Employee(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }
}

class PEmp extends Employee {
    private int hra;

    PEmp(String empName, int hra) {
        super(empName);
        this.hra = hra;
    }

    public int getHra() {
        return hra;
    }
}

class TEmp extends Employee {
    private int duration;

    TEmp(String empName, int duration) {
        super(empName);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}



class Organ {

    private TreeMap<String, ArrayList<Employee>> empMap;
    private Scanner s;

    Organ() {
        empMap = new TreeMap<>();

        empMap.put("PEmp", new ArrayList<>());
        empMap.put("TEmp", new ArrayList<>());

        s = new Scanner(System.in);
    }

    void registerEmployee() {

        System.out.print("Enter Employee Name: ");
        String empName = s.next();

        System.out.println("1: Temporary Employee");
        System.out.println("2: Permanent Employee");
        System.out.print("Enter your choice: ");

        int choice = s.nextInt();

        switch (choice) {

        case 1:

            System.out.print("Enter Duration: ");
            int duration = s.nextInt();

            empMap.get("TEmp")
                  .add(new TEmp(empName, duration));

            System.out.println("Temporary Employee Registered Successfully");
            break;

        case 2:

            System.out.print("Enter HRA: ");
            int hra = s.nextInt();

            empMap.get("PEmp")
                  .add(new PEmp(empName, hra));

            System.out.println("Permanent Employee Registered Successfully");
            break;

        default:
            System.out.println("Invalid Choice");
        }

        System.out.println();
    }

    void dispEmpDetails() {

        if (empMap.get("PEmp").isEmpty()
                && empMap.get("TEmp").isEmpty()) {

            System.out.println("No records found");
            return;
        }

        System.out.println("1: Display All Employees");
        System.out.println("2: Display Permanent Employees");
        System.out.println("3: Display Temporary Employees");

        System.out.print("Enter your choice: ");
        int choice = s.nextInt();

        switch (choice) {

        case 1:

            System.out.println("\nPermanent Employees:");

            for (Employee e : empMap.get("PEmp")) {

                PEmp p = (PEmp) e;

                System.out.println("Employee Name : "
                        + p.getEmpName());

                System.out.println("Employee HRA  : "
                        + p.getHra());

                System.out.println();
            }

            System.out.println("Temporary Employees:");

            for (Employee e : empMap.get("TEmp")) {

                TEmp t = (TEmp) e;

                System.out.println("Employee Name     : "
                        + t.getEmpName());

                System.out.println("Employee Duration : "
                        + t.getDuration());

                System.out.println();
            }

            break;

        case 2:

            if (empMap.get("PEmp").isEmpty()) {
                System.out.println("No Permanent Employees Found");
            }
            else {

                for (Employee e : empMap.get("PEmp")) {

                    PEmp p = (PEmp) e;

                    System.out.println("Employee Name : "
                            + p.getEmpName());

                    System.out.println("Employee HRA  : "
                            + p.getHra());

                    System.out.println();
                }
            }

            break;

        case 3:

            if (empMap.get("TEmp").isEmpty()) {
                System.out.println("No Temporary Employees Found");
            }
            else {

                for (Employee e : empMap.get("TEmp")) {

                    TEmp t = (TEmp) e;

                    System.out.println("Employee Name     : "
                            + t.getEmpName());

                    System.out.println("Employee Duration : "
                            + t.getDuration());

                    System.out.println();
                }
            }

            break;

        default:
            System.out.println("Invalid Option");
        }
    }

    void closeScanner() {
        s.close();
    }
}
public class ExampleTree {
	 public static void main(String[] args) {
	        Organ inst = new Organ();
	        inst.registerEmployee();
	        inst.registerEmployee();
	        inst.registerEmployee();
	        inst.registerEmployee();
	        inst.dispEmpDetails();
	        inst.closeScanner();
}
}