package hashmapTest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;

public class HashSetIterationTest {

    @Test
    public void testHashSetIteration() {
        // Create a HashSet
        HashSet<String> stringSet = new HashSet<>();

        // Add 10 strings to the HashSet
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Orange");
        stringSet.add("Grapes");
        stringSet.add("Pineapple");
        stringSet.add("Strawberry");
        stringSet.add("Mango");
        stringSet.add("Peach");
        stringSet.add("Watermelon");
        stringSet.add("Kiwi");

        // Test size of HashSet
        assertEquals(10, stringSet.size());

        // Test presence of each element
        assertTrue(stringSet.contains("Apple"));
        assertTrue(stringSet.contains("Banana"));
        assertTrue(stringSet.contains("Orange"));
        assertTrue(stringSet.contains("Grapes"));
        assertTrue(stringSet.contains("Pineapple"));
        assertTrue(stringSet.contains("Strawberry"));
        assertTrue(stringSet.contains("Mango"));
        assertTrue(stringSet.contains("Peach"));
        assertTrue(stringSet.contains("Watermelon"));
        assertTrue(stringSet.contains("Kiwi"));
    }
}
