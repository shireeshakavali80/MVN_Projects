package practiceTest;
import org.junit.Test;
import practice.ArraySum;

import static org.junit.Assert.assertEquals;

public class ArraySumTest {

    @Test
    public void testCalculateSum() {
        // Test case 1: Array with positive numbers
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(15, ArraySum.calculateSum(array1));

        // Test case 2: Array with negative numbers
        int[] array2 = {-1, -2, -3, -4, -5};
        assertEquals(-15, ArraySum.calculateSum(array2));

        // Test case 3: Array with both positive and negative numbers
        int[] array3 = {10, -2, 5, -8, 3};
        assertEquals(8, ArraySum.calculateSum(array3));

        // Test case 4: Empty array
        int[] array4 = {};
        assertEquals(0, ArraySum.calculateSum(array4));
    }
}
