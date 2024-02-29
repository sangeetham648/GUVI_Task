package task_04;

//Q3. Store name of weekdays in an array (starting from "Sunday" at 0 index). Ask day position from user and print day name. 

//Handle array index out of bound exception and give proper message if user enters day index outside range (0-6).

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
    	
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter day position (0-6): ");
            int dayPosition = scanner.nextInt();

            if (dayPosition < 0 || dayPosition > 6) {
                throw new ArrayIndexOutOfBoundsException("Day position should be between 0 and 6.");
            }

            System.out.println("Day name: " + weekdays[dayPosition]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

/*
Enter day position (0-6): 4
Day name: Thursday

Enter day position (0-6): 8
Array Index Out of Bounds Exception: Day position should be between 0 and 6.

Enter day position (0-6): a
Error: null

*/

