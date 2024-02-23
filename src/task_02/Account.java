package task_02;

import java.util.Scanner;

//Q3. Create Class Account with data member As Balance. Create two constructors (no argument, and two arguments) and perform following task
//a. method to deposit the amount to the account.
//b. method to withdraw the amount from the account.
//C. method to display the Balance

public class Account {
	
	int ac_num;
	double balance;
	
	public Account() {}
	
	public Account(int ac_num, double balance) {
        this.ac_num = ac_num;
        this.balance = balance;
    }
	
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Done.");
        } else {
            System.out.println("Deposit failed.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn Done.");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid amount...");
        }
    }

    public double displayBalance() {
    	return balance;
    }

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Account number : ");
		int account_number = s.nextInt();
		
		System.out.print("Enter Current balance : ");
		double balance = s.nextDouble();
		
		Account account = new Account(account_number,balance);
		
		System.out.print("Enter Deposit amount : ");
		double deposit_amount = s.nextDouble();
		account.deposit(deposit_amount);
		
		System.out.print("Enter Withdraw amount : ");
		double withdraw_amount = s.nextDouble();
		account.withdraw(withdraw_amount);
		
		System.out.print("Check Available balance : " + account.displayBalance());
		
		s.close();
		
	}

}
