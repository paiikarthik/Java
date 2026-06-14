package ArrayLi;

import java.util.ArrayList;
import java.util.Scanner;

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

    private ArrayList<Employee> emp;
    private Scanner s;

    Organ() {
        emp = new ArrayList<>();
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

                emp.add(new TEmp(empName, duration));
                System.out.println("Temporary Employee Registered Successfully\n");
                break;

            case 2:
                System.out.print("Enter HRA: ");
                int hra = s.nextInt();

                emp.add(new PEmp(empName, hra));
                System.out.println("Permanent Employee Registered Successfully\n");
                break;

            default:
                System.out.println("Invalid Choice\n");
        }
    }

    void dispEmpDetails() {

        if (emp.isEmpty()) {
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
                for (Employee e : emp) {
                    System.out.println("Employee Name: " + e.getEmpName());
                    if (e instanceof PEmp) {
                        System.out.println("Employee Type: Permanent");
                        System.out.println("Employee HRA: " + ((PEmp) e).getHra());
                    } else if (e instanceof TEmp) {
                        System.out.println("Employee Type: Temporary");
                        System.out.println("Employee Duration: " + ((TEmp) e).getDuration());
                    }
                    System.out.println();
                }
                break;
                
            case 2:
                 for (Employee e : emp) {
                    if (e instanceof PEmp) {
                        System.out.println("Employee Name: "+ e.getEmpName());
                        System.out.println("Employee HRA: " + ((PEmp) e).getHra());
                        System.out.println();
                    }
                }
                break;

                
            case 3:
                for (Employee e : emp) {
                    if (e instanceof TEmp) {
                        System.out.println("Employee Name: "+ e.getEmpName());
                        System.out.println("Employee Duration: "+ ((TEmp) e).getDuration());
                        System.out.println();
                    }
                }
                break;
                
         default:
                System.out.println("Invalid Option");
        }
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
