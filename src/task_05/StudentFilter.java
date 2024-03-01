package task_05;

//Q3. You are a teacher in school .In your class there are 10 students, you have decided to give special gifts to those students whose names start with "A". 
//you are asked to separate those students with the help of a java program.
//Requirement:
//Use List interface to store the student name
//Use a lambda expression and the Stream API to filter the students

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentFilter {
    public static void main(String[] args) {
    	
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Aruna");
        studentNames.add("Banu");
        studentNames.add("Charlie");
        studentNames.add("Abhirami");
        studentNames.add("Yogesh");
        studentNames.add("Dharani");
        studentNames.add("Geetha");
        studentNames.add("Ammu");
        studentNames.add("John");
        studentNames.add("Akshaya");
        
        // Use Stream API and lambda expression to filter students whose names start with "A"
        List<String> studentsWithA = studentNames.stream()
                                                 .filter(name -> name.startsWith("A"))
                                                 .collect(Collectors.toList());
        
        // Print the students with names starting with "A"
        System.out.println("Students with names starting with 'A': " + studentsWithA);
    }
}


// output :  Students with names starting with 'A': [Aruna, Abhirami, Ammu, Akshaya]
