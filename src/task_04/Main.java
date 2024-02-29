package task_04;

import java.util.Scanner;
import java.lang.Exception;

//Q1. Ramesh is developing a student management system for a university. In this system, you have a Student class to represent student information. 
//You are asked to help Ramesh to handle exception which can be occurred into program according to following Scenarios:
//class Student with attributes roll no, name, age and course. Initialize values through parameterized constructor.
//If the age of the student is not between 15 and 21 then generate a user-defined exception "AgeNotWithinRangeException".
//If a name contains numbers or special symbols, raise exception "NameNotValidException". Define the two exception classes.


@SuppressWarnings("serial")
class AgeNotWithinRangeException extends Exception {
	public AgeNotWithinRangeException(String message) {
	    super(message);
	}
}

@SuppressWarnings("serial")
class NameNotValidException extends Exception {
	public NameNotValidException(String message) {
	    super(message);
	}
}

class Student {
	private int rollNo;
	private String name;
	private int age;
	private String course;
	
	public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
	    if (age < 15 || age > 21) {
	        throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
	    }
	    if (!isValidName(name)) {
	        throw new NameNotValidException("Name should not contain numbers or special symbols.");
	    }
	
	    this.rollNo = rollNo;
	    this.name = name;
	    this.age = age;
	    this.course = course;
	}

	private boolean isValidName(String name) {
	    return name.matches("[a-zA-Z\\s]+");
	}

	public String toString() {
	    return "Student\t{" +"rollNo=" + rollNo +", name='" + name + '\'' +", age=" + age +", course='" + course + '\'' +'}';
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    try {
	    		System.out.println("Enter Student Details : ");
	    		System.out.print("Enter Student Roll number : ");
	    		int rollnum = s.nextInt();
	    		System.out.print("Enter Student Name : ");
	    		String name = s.next();
	    		System.out.print("Enter Student Age : ");
	    		int age = s.nextInt();
	    		System.out.print("Enter Student Course : ");
	    		String course = s.next();
		        Student student1 = new Student(rollnum,name,age,course);
		        System.out.println(student1);
		
		    } catch (AgeNotWithinRangeException e) {
		        System.out.println("AgeNotWithinRangeException: " + e.getMessage());
		    } catch (NameNotValidException e) {
		        System.out.println("NameNotValidException: " + e.getMessage());
		    }finally {
				s.close();
			}
		}
}


/*
 
Enter Student Details : 
Enter Student Roll number : 1010
Enter Student Name : anhduisk
Enter Student Age : 22
Enter Student Course : CSE
AgeNotWithinRangeException: Age should be between 15 and 21.


Enter Student Details : 
Enter Student Roll number : 2039
Enter Student Name : nshdfug
Enter Student Age : 19
Enter Student Course : ece
Student	{rollNo=2039, name='nshdfug', age=19, course='ece'}
 
*/
