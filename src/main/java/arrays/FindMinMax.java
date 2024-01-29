package arrays;

public class FindMinMax {
    public static void main(String[] args) {
        // Sample integer array
        int[] numbers = {3,7,1,9,2,65};

        findMinMax(numbers); // method calling
    }
    public static void findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int min = arr[0];
        int max = arr[0];

        // Iterate through the array
        for (int num : arr) { // for each number in array
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}
