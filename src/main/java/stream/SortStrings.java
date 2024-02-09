package stream;
import java.util.Arrays;
import java.util.Comparator;

public class SortStrings {

    public static void main(String[] args) {
        // Example array of strings
        String[] inputArray = {"apple", "banana", "grape", "pear", "kiwi", "java"};

        // Use Streams and Lambdas to sort strings based on criteria
        String[] result = sortStrings(inputArray);

        // Print the sorted strings
        Arrays.stream(result).forEach(System.out::println);
    }

    public static String[] sortStrings(String[] inputArray) {
        return Arrays.stream(inputArray)
                .sorted(Comparator.comparing(String::length)  // Sort by length in ascending order
                        .thenComparing(String::length)        // If lengths are the same
                        .reversed()  // Sort in descending order
                        .thenComparing((String s) -> s.charAt(s.length() - 1)).reversed())
                .toArray(String[]::new);
    }
}
