package task_04;

import java.util.Scanner;

//Q2. Create a class Voter(voterId, name, age) with parameterized constructor. The parameterized constructor should throw a checked exception if age is less than 18. 
//The message of exception is "invalid age for voter "

@SuppressWarnings("serial")

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Voter {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Voter{" +"voterId=" + voterId +", name='" + name + '\'' +", age=" + age +'}';
    }
}

public class Voter_Main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
        try {
        	System.out.print("Enter Voter ID : ");
        	int id = s.nextInt();
        	System.out.print("Enter Name : ");
        	String name = s.next();
        	System.out.print("Enter Age : ");
        	int age = s.nextInt();
            Voter voter1 = new Voter(id,name,age);
            System.out.println(voter1);

        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }finally {
			s.close();
		}
    }
}



/*Output
 
Enter Voter ID : 10012
Enter Name : Anuraj
Enter Age : 20
Voter{voterId=10012, name='Anuraj', age=20}


Enter Voter ID : 204
Enter Name : abi
Enter Age : 15
InvalidAgeException: Invalid age for voter

*/
