package streamTest;

import org.junit.jupiter.api.Test;
import stream.CapitalizeAndSort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeAndSortTest {

    @Test
    void testCapitalizeAndSortStrings() {
        String[] inputArray = {"apple", "banana", "orange", "grape"};

        CapitalizeAndSort CapitalizeAndSortStrings = null;
        List<String> result = CapitalizeAndSort.capitalizeAndSortStrings(inputArray);

        // Check if the result is not null
        assertNotNull(result);

        // Check if the size of the result is correct
        assertEquals(4, result.size());

        // Check if the strings are capitalized and sorted
        assertEquals("Apple", result.get(0));
        assertEquals("Banana", result.get(1));
        assertEquals("Grape", result.get(2));
        assertEquals("Orange", result.get(3));

        String[] emptyArray = {};
        List<String> resultEmpty = CapitalizeAndSort.capitalizeAndSortStrings(emptyArray);

        assertNotNull(resultEmpty);
        assertTrue(resultEmpty.isEmpty());
    }


}