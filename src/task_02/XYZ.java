package task_02;

import java.util.Scanner;

//Q2. Create class Product (pid, price, quantity) with parameterized constructor. Create a main function in different class (say XYZ) and perform following task:
//a. Accept five product information from user and store in an array
//b. Find Pid of the product with the highest price.
//c. Create method (with array of product's object as argument) in XYZ class to
//calculate and return the total amount spent on all products. (amount spent on
//single product=price of product * quantity of product

class Product {
	
	public int pid;
	public double price;
	public int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

public class XYZ {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter count of the Product : ");
		int n = s.nextInt();
		
        Product[] products = new Product[n];
        
        for (int i = 0; i < n; i++) {
        	
            System.out.println("Enter product " + (i + 1) + " information : ");
            
            System.out.print("Product ID: ");
            
            int pid = s.nextInt();
            
            System.out.print("Price: ");
            double price = s.nextDouble();
            
            System.out.print("Quantity: ");
            int quantity = s.nextInt();

            products[i] = new Product(pid, price, quantity);
        }
        
        int maxPricePid = pidOfMaxPriceProduct(products);
        System.out.println("Product ID with the highest price: " + maxPricePid);

        double totalAmountSpent = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmountSpent);

	}
	
    public static int pidOfMaxPriceProduct(Product[] products) {
    	
        double maxPrice = 0.0;
        
        int maxPricePid = -1;
        
        for(int i=0; i<products.length; i++) {
        	
        	if(products[i].price> maxPrice){
        		maxPrice = products[i].price;
                maxPricePid = products[i].pid;
        	}
        }

        return maxPricePid;
    }

    public static double calculateTotalAmount(Product[] products) {
    	
        double totalAmountSpent = 0;
        
        for(int i=0; i<products.length; i++) {
        	totalAmountSpent += products[i].price * products[i].quantity;
        }
        
        return totalAmountSpent;
    }

}
