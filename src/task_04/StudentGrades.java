package task_04;

//Q4. Create a HashMap where keys are student names (strings) and values are their corresponding grades (integers). 
// Create methods to add a new student, remove a student, and Display up a student's grade by name.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGrades {
    private Map<String, Integer> studentGrades;

    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student "+ name +" has added to the Hashmap");
    }

    public void removeStudent(String name) {
        studentGrades.remove(name);
        System.out.println("Student "+ name +" has removed from the Hashmap");
    }

    public void displayGrade(String name) {
        Integer grade = studentGrades.get(name);
        if (grade != null) {
            System.out.println(name + "'s grade: " + grade);
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        StudentGrades studentGrades = new StudentGrades();

        // Adding sample data
//        studentGrades.addStudent("Arun", 85);
//        studentGrades.addStudent("Ajay", 90);
//        studentGrades.addStudent("Bala", 75);
//        studentGrades.addStudent("Anjali", 90);
//        studentGrades.addStudent("Vicky", 75);

        while (true) {
            System.out.println("\nStudent Grade System : \t 1. Add Student \t 2. Remove Student \t 3. Display Student Grade\t4. Exit");
           
            System.out.print("Enter your choice : ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    
                    System.out.print("Enter student grade: ");
                    int grade = scanner.nextInt();
                    
                    studentGrades.addStudent(name, grade);
                    break;
                    
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.next();
                    
                    studentGrades.removeStudent(removeName);
                    break;
                    
                case 3:
                    System.out.print("Enter student name to display grade: ");
                    String displayName = scanner.next();
                    
                    studentGrades.displayGrade(displayName);
                    break;
                    
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        }
    }
}

/*
 
 Student Grade System : 	 1. Add Student 	 2. Remove Student 	 3. Display Student Grade	4. Exit
Enter your choice : 1
Enter student name: aaaa
Enter student grade: 1
Student aaaa has added to the Hashmap

Student Grade System : 	 1. Add Student 	 2. Remove Student 	 3. Display Student Grade	4. Exit
Enter your choice : 1
Enter student name: bbbbb
Enter student grade: 2
Student bbbbb has added to the Hashmap

Student Grade System : 	 1. Add Student 	 2. Remove Student 	 3. Display Student Grade	4. Exit
Enter your choice : 1
Enter student name: ccccc
Enter student grade: 3
Student ccccc has added to the Hashmap

Student Grade System : 	 1. Add Student 	 2. Remove Student 	 3. Display Student Grade	4. Exit
Enter your choice : 3
Enter student name to display grade: ccccc
ccccc's grade: 3

Student Grade System : 	 1. Add Student 	 2. Remove Student 	 3. Display Student Grade	4. Exit
Enter your choice : 2
Enter student name to remove: bbbbb
Student bbbbb has removed from the Hashmap

Student Grade System : 	 1. Add Student 	 2. Remove Student 	 3. Display Student Grade	4. Exit
Enter your choice : 3
Enter student name to display grade: bbbbb
Student not found.
 
 */
