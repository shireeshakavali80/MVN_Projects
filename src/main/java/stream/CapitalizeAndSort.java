package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CapitalizeAndSort {

    public static List<String> capitalizeAndSortStrings(String[] inputArray) {
        return Arrays.stream(inputArray)
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String[] inputArray = {"apple", "banana", "orange", "grape"};

        List<String> result = capitalizeAndSortStrings(inputArray);

        // Print the result
        result.forEach(System.out::println);
    }
}