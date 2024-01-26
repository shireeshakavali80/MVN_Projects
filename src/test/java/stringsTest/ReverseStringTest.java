package stringsTest;

import org.junit.Test;
import strings.ReverseString;

import static org.junit.Assert.assertArrayEquals;

public class ReverseStringTest {

    @Test
    public void testReverseWords_successful() {
        String[] input = {"Hello", "World"};
        String[] expectedOutput = {"olleH", "dlroW"};

        String[] result = ReverseString.reverseWords(input);

        assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void testReverseWords_nullInput() {
        String[] input = null;
        String[] expectedOutput = {};

        String[] result = ReverseString.reverseWords(input);

        assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void testReverseWords_emptyInput() {
        String[] input = {};
        String[] expectedOutput = {};

        String[] result = ReverseString.reverseWords(input);

        assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void testReverseWords_zeroInput() {
        String[] input = {"0"};
        String[] expectedOutput = {"0"};

        String[] result = ReverseString.reverseWords(input);

        assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void testReverseWords_unexpectedInput() {
        String[] input = {"That", "is", "a", "test"};
        String[] expectedOutput = {"tahT", "si", "a", "tset"};

        String[] result = ReverseString.reverseWords(input);

        assertArrayEquals(expectedOutput, result);
    }
}
