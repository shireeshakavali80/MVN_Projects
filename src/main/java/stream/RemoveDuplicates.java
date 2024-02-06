package stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        return numbers.stream()
                .distinct()  // Remove duplicates
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Example list of integers with duplicates
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1);

        // Use Streams and Lambdas to remove duplicate elements
        List<Integer> result = removeDuplicates(numbers);

        // Print the result
        result.forEach(System.out::println);
    }
}

