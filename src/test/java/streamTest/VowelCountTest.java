package streamTest;

import org.junit.jupiter.api.Test;
import stream.VowelCount;

import static org.junit.jupiter.api.Assertions.*;

public class VowelCountTest {

    @Test
    void testCountVowels() {
        // Test cases with expected vowel counts
        assertEquals(2, VowelCount.countVowels("apple"));
        assertEquals(3, VowelCount.countVowels("banana"));
        assertEquals(2, VowelCount.countVowels("grape"));
        assertEquals(2, VowelCount.countVowels("pear"));
        assertEquals(2, VowelCount.countVowels("kiwi"));
        assertEquals(2, VowelCount.countVowels("java"));

        // Test cases with zero vowels
        assertEquals(0, VowelCount.countVowels("xyz"));
        assertEquals(0, VowelCount.countVowels(""));
        assertEquals(0, VowelCount.countVowels("123"));

        // Test case with all vowels
        assertEquals(5, VowelCount.countVowels("aeiou"));
    }
}
