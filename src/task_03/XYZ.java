package task_03;

//Q2.Create Interface Taxable with members sales Tax=7% and income Tax=10.5%. create abstract method calcTax().
//a. Create class Employee(empId,name, salary) and implement Taxable to calculate income Tax on yearly salary.
//b. Create class Product(pid,price,quantity) and implement Taxable to calculate sales Tax on unit price of product.
//c. Create class for main method(Say XYZ), accept employee information and a product information from user and print 
//income tax and sales tax respectively

import java.util.Scanner;

class Employee implements Taxable{
	
    private int empId;
    private String name;
    private double salary;
    private double tax;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void calcTax() {
        this.tax = salary * incomeTaxPercent;
    }
    
    public String toString() {
        return " Employee ID = " + empId + "\tEmployee name = " + name + " \tEmployee Salary = "+ salary +"\tIncome Tax = "+ tax;
    }

}

class Product implements Taxable {
    private int pid;
    private double price;
    private int quantity;
    private double tax;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void calcTax() {
        this.tax = price * quantity * salesTaxPercent;
    }
    
    public String toString() {
        return " Price ID = " + pid + "\tPrice amount = " + price  + " \tItem Quantity = "+ quantity +"\tSales Tax = "+ tax;
    }
}

public class XYZ {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee information:");
        
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        
        System.out.print("Employee Name: ");
        String empName = scanner.next();
        
        System.out.print("Employee Salary: ");
        double empSalary = scanner.nextDouble();
        
        Employee employee = new Employee(empId, empName, empSalary);

        System.out.println("\nEnter product information:");
        System.out.print("Product ID: ");
        int pid = scanner.nextInt();
        
        System.out.print("Product Price: ");
        double price = scanner.nextDouble();
        
        System.out.print("Product Quantity: ");
        int quantity = scanner.nextInt();
        
        Product product = new Product(pid, price, quantity);
        
        employee.calcTax();
        product.calcTax();

        System.out.println("\nIncome Tax for employee with details : " + employee);
        System.out.println("Sales Tax for product with details : " + product);

        scanner.close();
        
    }
}

