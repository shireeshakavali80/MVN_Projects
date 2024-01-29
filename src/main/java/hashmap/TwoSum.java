package hashmap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] findTwoSumIndices(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }

            numMap.put(nums[i], i);
        }

        // No solution found
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 100;

        int[] result = findTwoSumIndices(nums, target);

        if (result[0] != -1 && result[1] != -1) {
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No indices found.");
        }
    }
}