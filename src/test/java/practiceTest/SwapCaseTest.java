package practiceTest;
import org.junit.Test;
import practice.SwapCase;

import static org.junit.Assert.assertEquals;

public class SwapCaseTest {

    @Test
    public void testSwapCase() {
        // Test case 1: String with mixed case characters
        String input1 = "Hello World! 123";
        assertEquals("hELLO wORLD! 123", SwapCase.swapCase(input1));

        // Test case 2: All uppercase characters
        String input2 = "UPPERCASE";
        assertEquals("uppercase", SwapCase.swapCase(input2));

        // Test case 3: All lowercase characters
        String input3 = "lowercase";
        assertEquals("LOWERCASE", SwapCase.swapCase(input3));

        // Test case 4: String with non-alphabetic characters
        String input4 = "!@#$%^&*()";
        assertEquals("!@#$%^&*()", SwapCase.swapCase(input4));

        // Test case 5: Empty string
        String input5 = "";
        assertEquals("", SwapCase.swapCase(input5));
    }
}
