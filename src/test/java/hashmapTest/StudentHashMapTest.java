package hashmapTest;

import hashmap.CharacterFrequency;
import hashmap.StudentHashMap;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StudentHashMapTest {

    @Test
    public void testGetStudentByName() {
        StudentHashMap studentHashMap = new StudentHashMap();

        // Test Case 1: Valid student name
        String searchName1 = "Alice";
        StudentHashMap.Student result1 = studentHashMap.getStudentByName(searchName1);
        assertEquals("Alice", result1.firstName);
        assertEquals("Johnson", result1.lastName);
        assertEquals(3.8, result1.GPA, 0.01);

        // Test Case 2: Invalid student name
        String searchName2 = "InvalidName";
        StudentHashMap.Student result2 = studentHashMap.getStudentByName(searchName2);
        assertNull(result2);
    }

    @Test
    public void testInitialStudentMapSize() {
        StudentHashMap studentHashMap = new StudentHashMap();
        Map<String, StudentHashMap.Student> studentMap = studentHashMap.getStudentMap();

        // Test the initial size of the student map
        assertEquals(8, studentMap.size());
    }

    @Nested
    class CharacterFrequencyTest {

        @org.junit.jupiter.api.Test
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
            Assertions.assertEquals(sortedExpectedOutput, sortedActualOutput);
        }
    }
}