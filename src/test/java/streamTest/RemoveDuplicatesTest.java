package streamTest;

import org.junit.jupiter.api.Test;
import stream.RemoveDuplicates;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicates() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1);

        List<Integer> result = RemoveDuplicates.removeDuplicates(inputList);

        // Assert that the result does not contain duplicates
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
        assertTrue(result.contains(3));
        assertTrue(result.contains(4));
        assertTrue(result.contains(5));
        assertTrue(result.contains(6));
        assertTrue(result.contains(7));
        assertTrue(result.contains(8));
        assertEquals(8, result.size()); // Assert that the size is correct
    }

    @Test
    void testRemoveDuplicates_EmptyList() {
        List<Integer> inputList = Arrays.asList();

        List<Integer> result = RemoveDuplicates.removeDuplicates(inputList);

        // Assert that the result is an empty list
        assertTrue(result.isEmpty());
    }

    @Test
    void testRemoveDuplicates_NoDuplicates() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = RemoveDuplicates.removeDuplicates(inputList);

        // Assert that the result is the same as the input list
        assertEquals(inputList, result);
    }
}

