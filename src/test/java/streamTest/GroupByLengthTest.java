package streamTest;

import org.junit.jupiter.api.Test;
import stream.GroupByLength;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class GroupByLengthTest {

    @Test
    void testGroupStringsByLength() {
        List<String> inputList = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        Map<Integer, List<String>> result = GroupByLength.groupStringsByLength(inputList);

        // Assert that the result contains the expected groups
        assertTrue(result.containsKey(5));
        assertTrue(result.containsKey(6));

        assertEquals(Arrays.asList("apple", "grape", "kiwi"), result.get(5));
        assertEquals(Arrays.asList("banana", "orange"), result.get(6));
    }

    @Test
    void testGroupStringsByLength_EmptyList() {
        List<String> inputList = Arrays.asList();

        Map<Integer, List<String>> result = GroupByLength.groupStringsByLength(inputList);

        // Assert that the result is an empty map
        assertTrue(result.isEmpty());
    }

    @Test
    void testGroupStringsByLength_SingleLength() {
        List<String> inputList = Arrays.asList("apple", "kiwi");

        Map<Integer, List<String>> result = GroupByLength.groupStringsByLength(inputList);

        // Assert that the result contains a single group
        assertTrue(result.containsKey(5));
        assertEquals(Arrays.asList("apple", "kiwi"), result.get(5));
    }
}

