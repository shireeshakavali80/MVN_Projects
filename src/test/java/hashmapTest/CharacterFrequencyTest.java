package hashmapTest;
import hashmap.CharacterFrequency;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterFrequencyTest {

    @Test
    public void testPrintCharacterFrequency() {
        // Redirect System.out to capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the method that prints the character frequency
        CharacterFrequency.printCharacterFrequency("test string");

        // Restore the original System.out
        System.setOut(System.out);

        // Get the actual output
        String actualOutput = outContent.toString().trim();

        // Define the expected output
        String expectedOutput = "e-1\ng-1\ni-1\nn-1\nr-1\ns-2\nt-3";

        // Split and sort the lines for comparison
        String[] actualLines = actualOutput.split("\\r?\\n");
        Arrays.sort(actualLines);

        String[] expectedLines = expectedOutput.split("\\r?\\n");
        Arrays.sort(expectedLines);

        // Join the lines back into strings for comparison
        String sortedActualOutput = String.join("\n", actualLines);
        String sortedExpectedOutput = String.join("\n", expectedLines);

        // Compare the sorted output with the expected output
        assertEquals(sortedExpectedOutput, sortedActualOutput);
    }
}
