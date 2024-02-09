package practiceTest;
import org.junit.Test;
import practice.RepeatedChar;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class RepeatedCharTest {

    @Test
    public void testFindRepeatedCharacters() {
        // Test case 1: Repeated characters are 'g' and 'r'
        String input1 = "programming";
        RepeatedChar RepeatedCharacters = null;
        Map<Character, Integer> result1 = RepeatedChar.findRepeatedCharacters(input1);
        assertEquals(2, result1.get('g').intValue());
        assertEquals(2, result1.get('r').intValue());
        assertEquals(1, result1.get('o').intValue());
        assertEquals(1, result1.get('a').intValue());

        // Test case 2: No repeated characters
        String input2 = "abcdef";
        Map<Character, Integer> result2 = RepeatedCharacters.findRepeatedCharacters(input2);
        assertEquals(null, result2.get('a'));
        assertEquals(null, result2.get('b'));
        assertEquals(null, result2.get('c'));
        assertEquals(null, result2.get('d'));
        assertEquals(null, result2.get('e'));
        assertEquals(null, result2.get('f'));

        // Test case 3: Repeated characters are 'a', 'b', and 'c'
        String input3 = "abcabc";
        Map<Character, Integer> result3 = RepeatedCharacters.findRepeatedCharacters(input3);
        assertEquals(2, result3.get('a').intValue());
        assertEquals(2, result3.get('b').intValue());
        assertEquals(2, result3.get('c').intValue());
    }
}

