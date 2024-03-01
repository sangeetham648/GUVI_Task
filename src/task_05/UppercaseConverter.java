package task_05;

//Q1. Write a program using map() method, to convert a list of Strings into uppercase.If the given List is: Stream names = Stream.of("aBc", "d", "ef");

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UppercaseConverter {
    public static void main(String[] args) {
        
        Stream<String> namesStream = Stream.of("aBc", "d", "ef");
        
        List<String> namesList = namesStream.collect(Collectors.toList());
        
        List<String> uppercaseNames = namesList.stream()
                                                .map(String::toUpperCase)
                                                .collect(Collectors.toList());
        
        System.out.println(uppercaseNames);
    }
}

//OUTPUT  :  [ABC, D, EF]