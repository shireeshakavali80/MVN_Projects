package streamTest;

import org.junit.jupiter.api.Test;
import stream.MaxElement;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class MaxElementTest {

    @Test
    void testFindMaxElement() {
        List<String> inputList = Arrays.asList("apple", "banana", "grape", "orange");

        String result = MaxElement.findMaxElement(inputList);

        // Assert that the result is the maximum element based on natural sorting order
        assertEquals("orange", result);
    }

    @Test
    void testFindMaxElement_EmptyList() {
        List<String> inputList = Arrays.asList();

        String result = MaxElement.findMaxElement(inputList);

        // Assert that the result is null for an empty list
        assertNull(result);
    }

    @Test
    void testFindMaxElement_SingleElement() {
        List<String> inputList = Arrays.asList("apple");

        String result = MaxElement.findMaxElement(inputList);

        // Assert that the result is the single element for a list with a single element
        assertEquals("apple", result);
    }

    @Test
    void testFindMaxElement_MultipleOccurrences() {
        List<String> inputList = Arrays.asList("banana", "grape", "banana", "orange");

        String result = MaxElement.findMaxElement(inputList);

        // Assert that the result is the maximum element based on natural sorting order
        assertEquals("orange", result);
    }
}

