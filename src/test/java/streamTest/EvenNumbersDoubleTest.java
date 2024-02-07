package streamTest;
import org.junit.jupiter.api.Test;
import stream.EvenNumbersDouble;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class EvenNumbersDoubleTest {

    @Test
    void testFilterAndDouble() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        EvenNumbersDouble EvenNumbersDouble;
        List<Integer> result = stream.EvenNumbersDouble.filterAndDouble(inputList);

        // Assert that the result contains doubled values of odd numbers
        assertEquals(List.of(2, 6, 10, 14, 18), result);

        // Assert that the result does not contain even numbers
        assertFalse(result.contains(2));
        assertFalse(result.contains(4));
        assertFalse(result.contains(6));
        assertFalse(result.contains(8));
        assertFalse(result.contains(10));
    }

    @Test
    void testFilterAndDouble_EmptyList() {
        List<Integer> inputList = Arrays.asList();

        List<Integer> result = EvenNumbersDouble.filterAndDouble(inputList);

        // Assert that the result is an empty list
        assertTrue(result.isEmpty());
    }

    @Test
    void testFilterAndDouble_AllEvenNumbers() {
        List<Integer> inputList = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> result = EvenNumbersDouble.filterAndDouble(inputList);

        // Assert that the result is an empty list
        assertTrue(result.isEmpty());
    }
}

