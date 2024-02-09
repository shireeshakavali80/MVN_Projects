package stream;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringFilter {

    public static List<String> filterStringsStartingWithA(List<String> inputList) {
        Predicate<String> startsWithA = s -> s.startsWith("A");

        return inputList.stream()
                .filter(startsWithA.negate()) // Use negate() to filter out strings not starting with "A"
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Example list of strings
        List<String> inputList = List.of("Apple", "Banana", "Orange", "Grape");

        // Use Streams and Lambdas to filter out strings starting with "A"
        List<String> result = filterStringsStartingWithA(inputList);

        // Print the result
        result.forEach(System.out::println);
    }
}

