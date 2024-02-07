package stream;

import java.util.Arrays; // Import the Arrays class

public class AverageOfSquares {

    public static double averageOfSquaresOfOddNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)  // Filter odd numbers
                .mapToDouble(n -> Math.pow(n, 2))  // Square each odd number
                .average()  // Calculate the average
                .orElse(0.0);  // Default to 0.0 if there are no odd numbers
    }

    public static void main(String[] args) {
        // Example array of integers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Calculate and print the average of squares of odd numbers
        double result = averageOfSquaresOfOddNumbers(numbers);
        System.out.println("Average of squares of odd numbers: " + result);
    }
}
