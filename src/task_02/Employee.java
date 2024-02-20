package task_02;

import java.util.Scanner;

//Q4. Define a base class Person with attributes name and age.
//Create a subclass Employee that inherits from Person and adds attributes like employeeID and salary.
//Use the super keyword to initialize the Person attributes in the Employee constructor.

class Person1{
	
	String name;
    int age;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Employee extends Person1{
    private int employeeID;
    private double salary;

    public Employee(String name, int age, int id, double salary) {
        super(name, age);
        this.employeeID = id;
        this.salary = salary;
    }

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Employee Details Below");
		
		System.out.print("Enter Employee Name : ");
		String name = s.next();
		
		System.out.print("Enter Employee Age : ");
		int age = s.nextInt();
		
		System.out.print("Enter Employee ID : ");
		int id = s.nextInt();
		
		System.out.print("Enter Employee Salary : ");
		double salary = s.nextDouble();
		
		Employee employee = new Employee(name,age,id,salary);
		
		System.out.println("Name : " + employee.name);
	    System.out.println("Age : " + employee.age);
	    System.out.println("Employee ID : " + employee.employeeID);
	    System.out.println("Salary : " + employee.salary);
		
	}

}
