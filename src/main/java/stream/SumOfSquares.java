package stream;

import java.util.Arrays;
import java.util.List;

public class SumOfSquares {

    public static int calculateSumOfSquares(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n > 0) // Filter out non-positive integers
                .mapToInt(n -> n * n) // Square each positive integer
                .sum(); // Calculate the sum
    }

    public static void main(String[] args) {
        // Example list of integers
        List<Integer> numbers = Arrays.asList(-2, 3, 0, 5, -7, 4, 1);

        // Use Streams and Lambdas to calculate the sum of the squares of positive integers
        int result = calculateSumOfSquares(numbers);

        // Print the result
        System.out.println("Sum of the squares of positive integers: " + result);
    }
}

