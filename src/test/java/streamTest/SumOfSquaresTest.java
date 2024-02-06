package streamTest;

import org.junit.jupiter.api.Test;
import stream.SumOfSquares;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SumOfSquaresTest {

    @Test
    void testCalculateSumOfSquares() {
        List<Integer> inputList = Arrays.asList(-2, 3, 0, 5, -7, 4, 1);

        int result = SumOfSquares.calculateSumOfSquares(inputList);

        // Assert that the result is the sum of the squares of positive integers
        assertEquals(3 * 3 + 5 * 5 + 4 * 4 + 1 * 1, result);
    }

    @Test
    void testCalculateSumOfSquares_EmptyList() {
        List<Integer> inputList = Arrays.asList();

        int result = SumOfSquares.calculateSumOfSquares(inputList);

        // Assert that the result is 0 for an empty list
        assertEquals(0, result);
    }

    @Test
    void testCalculateSumOfSquares_AllNegativeNumbers() {
        List<Integer> inputList = Arrays.asList(-2, -3, -5, -7);

        int result = SumOfSquares.calculateSumOfSquares(inputList);

        // Assert that the result is 0 for a list with all negative numbers
        assertEquals(0, result);
    }
}
