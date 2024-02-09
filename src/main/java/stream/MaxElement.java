package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxElement {

    public static String findMaxElement(List<String> strings) {
        Optional<String> maxElement = strings.stream()
                .max(String::compareTo); // Natural sorting order

        return maxElement.orElse(null);
    }

    public static void main(String[] args) {
        // Example list of strings
        List<String> strings = Arrays.asList("apple", "banana", "grape", "orange");

        // Use Streams and Lambdas to find the maximum element based on natural sorting order
        String result = findMaxElement(strings);

        // Print the result
        System.out.println("Maximum element: " + result);
    }
}

