package practiceTest;


    import org.junit.Test;
    import practice.SortHashMap;

    import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

    public class SortHashMapTest {

        @Test
        public void testSortHashMapByKeys() {
            // Create a HashMap
            Map<String, Integer> unsortedMap = new HashMap<>();
            unsortedMap.put("John", 30);
            unsortedMap.put("Alice", 25);
            unsortedMap.put("Bob", 35);
            unsortedMap.put("Diana", 28);

            // Sort the map by keys
            Map<String, Integer> sortedMap = SortHashMap.sortHashMap(unsortedMap, Map.Entry.comparingByKey());

            // Expected result
            String[] expectedKeys = {"Alice", "Bob", "Diana", "John"};
            int[] expectedValues = {25, 35, 28, 30};

            // Assert the sorted map
            int i = 0;
            for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
                assertEquals(expectedKeys[i], entry.getKey());
                assertEquals(expectedValues[i], entry.getValue().intValue());
                i++;
            }
        }

        @Test
        public void testSortHashMapByValues() {
            // Create a HashMap
            Map<String, Integer> unsortedMap = new HashMap<>();
            unsortedMap.put("John", 30);
            unsortedMap.put("Alice", 25);
            unsortedMap.put("Bob", 35);
            unsortedMap.put("Diana", 28);

            // Sort the map by values
            Map<String, Integer> sortedMap = SortHashMap.sortHashMap(unsortedMap, Map.Entry.comparingByValue());

            // Expected result
            String[] expectedKeys = {"Alice", "Diana", "John", "Bob"};
            int[] expectedValues = {25, 28, 30, 35};

            // Assert the sorted map
            int i = 0;
            for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
                assertEquals(expectedKeys[i], entry.getKey());
                assertEquals(expectedValues[i], entry.getValue().intValue());
                i++;
            }
        }
    }


