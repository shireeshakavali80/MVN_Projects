package streamTest;

import org.junit.jupiter.api.Test;
import stream.AverageOfSquares;

import static org.junit.jupiter.api.Assertions.*;

public class AverageOfSquaresTest {

    @Test
    void testAverageOfSquaresOfOddNumbers() {
        // Test case with odd numbers only
        int[] numbers1 = {1, 3, 5, 7, 9};
        assertEquals(33.0, AverageOfSquares.averageOfSquaresOfOddNumbers(numbers1), 0.001);

        // Test case with even numbers only
        int[] numbers2 = {2, 4, 6, 8, 10};
        assertEquals(0.0, AverageOfSquares.averageOfSquaresOfOddNumbers(numbers2), 0.001);

        // Test case with a mix of odd and even numbers
        int[] numbers3 = {1, 2, 3, 4, 5};
        assertEquals(11.666666666666666, AverageOfSquares.averageOfSquaresOfOddNumbers(numbers3), 0.001);

        // Test case with an empty array
        int[] numbers4 = {};
        assertEquals(0.0, AverageOfSquares.averageOfSquaresOfOddNumbers(numbers4), 0.001);
    }
}
