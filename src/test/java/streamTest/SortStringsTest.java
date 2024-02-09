package streamTest;
import org.junit.jupiter.api.Test;
import stream.SortStrings;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class SortStringsTest {

    @Test
    void testSortStrings() {
        // Test case with random strings
        String[] input1 = {"apple", "banana", "grape", "pear", "kiwi", "java"};
        String[] result1 = SortStrings.sortStrings(input1);
        assertArrayEqualsIgnoreOrder(new String[]{"kiwi", "java", "pear", "apple", "grape", "banana"}, result1);

        // Test case with strings of the same length
        String[] input2 = {"apple", "kiwi", "java", "pear"};
        String[] result2 = SortStrings.sortStrings(input2);
        assertArrayEqualsIgnoreOrder(new String[]{"kiwi", "java", "pear", "apple"}, result2);

        // Test case with empty array
        String[] input3 = {};
        String[] result3 = SortStrings.sortStrings(input3);
        assertArrayEqualsIgnoreOrder(new String[]{}, result3);

        // Test case with one element
        String[] input4 = {"apple"};
        String[] result4 = SortStrings.sortStrings(input4);
        assertArrayEqualsIgnoreOrder(new String[]{"apple"}, result4);
    }

    private static void assertArrayEqualsIgnoreOrder(String[] expected, String[] actual) {
        Arrays.sort(expected);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }
}



