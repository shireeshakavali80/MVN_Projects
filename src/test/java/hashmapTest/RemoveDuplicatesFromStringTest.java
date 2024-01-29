package hashmapTest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import hashmap.RemoveDuplicatesFromString;

public class RemoveDuplicatesFromStringTest {

    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicatesFromString remover = new RemoveDuplicatesFromString();

        // Test with string containing duplicates
        String stringWithDuplicates = "hello";
        assertEquals("helo", remover.removeDuplicates(stringWithDuplicates));

        // Test with string containing no duplicates
        String stringWithoutDuplicates = "world";
        assertEquals("world", remover.removeDuplicates(stringWithoutDuplicates));

        // Test with empty string
        String emptyString = "";
        assertEquals("", remover.removeDuplicates(emptyString));

        // Test with string containing all duplicate characters
        String allDuplicates = "aaaa";
        assertEquals("a", remover.removeDuplicates(allDuplicates));

        // Test with string containing mixed characters
        String mixedChars = "abracadabra";
        assertEquals("abrcd", remover.removeDuplicates(mixedChars));
    }
}