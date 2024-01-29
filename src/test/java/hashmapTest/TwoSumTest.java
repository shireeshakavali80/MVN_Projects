package hashmapTest;
import hashmap.TwoSum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void testFindTwoSumIndices() {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 100;

        int[] expected = {3, 5};
        int[] result = TwoSum.findTwoSumIndices(nums, target);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testNoSolution() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 20;

        int[] expected = {-1, -1};
        int[] result = TwoSum.findTwoSumIndices(nums, target);

        assertArrayEquals(expected, result);
    }
}
