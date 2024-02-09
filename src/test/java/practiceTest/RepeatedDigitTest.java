package practiceTest;

import org.junit.Test;
import practice.RepeatedDigit;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class RepeatedDigitTest {

    @Test
    public void testRepeatedDigits() {
        // Redirect System.out to capture printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Test case 1: Digits 2 and 3 are repeated
        RepeatedDigit.main(new String[]{"129321"});
        assertEquals("Digits repeated more than once:\n2\n3\n", outputStream.toString());

        // Test case 2: Digits 1, 7, and 8 are repeated
        outputStream.reset();
        RepeatedDigit.main(new String[]{"117834789"});
        assertEquals("Digits repeated more than once:\n1\n7\n8\n", outputStream.toString());

        // Test case 3: No repeated digits
        outputStream.reset();
        RepeatedDigit.main(new String[]{"123456789"});
        assertEquals("Digits repeated more than once:\n", outputStream.toString());

        // Test case 4: Single digit repeated
        outputStream.reset();
        RepeatedDigit.main(new String[]{"1234523"});
        assertEquals("Digits repeated more than once:\n2\n", outputStream.toString());

        // Test case 5: All digits are repeated
        outputStream.reset();
        RepeatedDigit.main(new String[]{"123450123450"});
        assertEquals("Digits repeated more than once:\n0\n1\n2\n3\n4\n5\n6\n7\n8\n9\n", outputStream.toString());

        // Reset System.out to normal
        System.setOut(System.out);
    }
}
