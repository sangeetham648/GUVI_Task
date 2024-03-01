package task_05;

//Q2. Write a program to check whether the Strings in the List are empty or not and print the list having non-empty strings. 
//If the given List is: Liststrings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");


import java.util.Arrays;
import java.util.List;

public class NonEmptyStringChecker {

	public static void main(String[] args) {
        List<String> listStrings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        
        System.out.println("Original list: " + listStrings);
        
        System.out.println("List with non-empty strings:");
        listStrings.stream()
                   .filter(s -> !s.isEmpty())
                   .forEach(System.out::println);

	}
}


/* Output 

Original list: [abc, , bc, efg, abcd, , jkl]
List with non-empty strings:
abc
bc
efg
abcd
jkl

*/
