package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {

    public static Map<Integer, List<String>> groupStringsByLength(List<String> strings) {
        return strings.stream()
                .collect(Collectors.groupingBy(String::length));
    }

    public static void main(String[] args) {
        // Example list of strings
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Use Streams and Lambdas to group strings by length
        Map<Integer, List<String>> result = groupStringsByLength(strings);

        // Print the result
        result.forEach((length, group) -> {
            System.out.println("Strings of length " + length + ": " + group);
        });
    }
}

