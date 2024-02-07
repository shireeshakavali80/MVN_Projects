package stream;


    import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

    public class EvenNumbersDouble {

        public static List<Integer> filterAndDouble(List<Integer> numbers) {
            return numbers.stream()
                    .filter(n -> n % 2 != 0) // Filter out even numbers
                    .map(n -> n * 2) // Double each remaining number
                    .collect(Collectors.toList());
        }

        public static void main(String[] args) {
            // Example list of integers
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            // Use Streams and Lambdas to filter out even numbers and double each remaining number
            List<Integer> result = filterAndDouble(numbers);

            // Print the result
            result.forEach(System.out::println);
        }
    }


