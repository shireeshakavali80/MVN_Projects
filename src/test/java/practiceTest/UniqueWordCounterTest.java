package practiceTest;
import org.junit.Test;
import practice.UniqueWordCounter;

import java.util.Map;
import static org.junit.Assert.assertEquals;

public class UniqueWordCounterTest {

    @Test
    public void testCountUniqueWords() {
        // Test case 1: String with repeated words
        String input1 = "Java is a programming language. Java is widely used for web development.";
        Map<String, Integer> result1 = UniqueWordCounter.countUniqueWords(input1);
        assertEquals(8, result1.size());
        assertEquals(2, result1.get("java").intValue());
        assertEquals(1, result1.get("is").intValue());
        assertEquals(1, result1.get("a").intValue());
        assertEquals(1, result1.get("programming").intValue());
        assertEquals(1, result1.get("language").intValue());
        assertEquals(1, result1.get("widely").intValue());
        assertEquals(1, result1.get("used").intValue());
        assertEquals(1, result1.get("for").intValue());

        // Test case 2: String with punctuation and mixed case
        String input2 = "Programming in Java is fun! Java is a versatile language.";
        Map<String, Integer> result2 = UniqueWordCounter.countUniqueWords(input2);
        assertEquals(9, result2.size());
        assertEquals(2, result2.get("java").intValue());
        assertEquals(2, result2.get("is").intValue());
        assertEquals(1, result2.get("programming").intValue());
        assertEquals(1, result2.get("in").intValue());
        assertEquals(1, result2.get("fun").intValue());
        assertEquals(1, result2.get("a").intValue());
        assertEquals(1, result2.get("versatile").intValue());
        assertEquals(1, result2.get("language").intValue());
        assertEquals(1, result2.get("and").intValue());

        // Test case 3: Empty string
        String input3 = "";
        Map<String, Integer> result3 = UniqueWordCounter.countUniqueWords(input3);
        assertEquals(0, result3.size());
    }
}
