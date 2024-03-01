package task_05;

//Q4. Rajesh has been given a task to create an app which takes the user's birthdate as input and calculates their age java.time.LocalDate class. 
//you have to help him to build this app using the
//Input : Enter your birthdate (yyyy-mm-dd): 1990-05-15
//Output: Your age is: 33 years, 4 months, and 13 days.

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateStr = scanner.nextLine();
        
        LocalDate birthdate = LocalDate.parse(birthdateStr, DateTimeFormatter.ISO_LOCAL_DATE);
        
        LocalDate currentDate = LocalDate.now();
        
        Period period = Period.between(birthdate, currentDate);
        
        System.out.println("Your age is: " + period.getYears() + " years, " +
                           period.getMonths() + " months, and " +
                           period.getDays() + " days.");
        
        scanner.close();
    }
}

/*output
 
Enter your birthdate (yyyy-mm-dd): 2000-12-21
Your age is: 23 years, 2 months, and 9 days.
  
 */
