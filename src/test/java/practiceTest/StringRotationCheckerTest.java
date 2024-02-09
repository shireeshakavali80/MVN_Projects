package practiceTest;
import org.junit.Test;
import practice.StringRotationChecker;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class StringRotationCheckerTest {

    @Test
    public void testIsRotation() {
        // Test case 1: Rotation of the same string
        String str1 = "hello";
        assertTrue(StringRotationChecker.isRotation(str1, str1));

        // Test case 2: Rotation of a different string
        String str2 = "lohel";
        assertTrue(StringRotationChecker.isRotation(str1, str2));

        // Test case 3: Not a rotation (different lengths)
        String str3 = "world";
        assertFalse(StringRotationChecker.isRotation(str1, str3));

        // Test case 4: Not a rotation (empty strings)
        String str4 = "";
        assertFalse(StringRotationChecker.isRotation(str1, str4));

        // Test case 5: Not a rotation (empty and different lengths)
        String str5 = "test";
        assertFalse(StringRotationChecker.isRotation(str4, str5));

        // Test case 6: Rotation with spaces
        String str6 = "hello world";
        String rotatedStr6 = " worldhello";
        assertTrue(StringRotationChecker.isRotation(str6, rotatedStr6));

        // Test case 7: Rotation with numbers
        String str7 = "12345";
        String rotatedStr7 = "34512";
        assertTrue(StringRotationChecker.isRotation(str7, rotatedStr7));
    }
}

