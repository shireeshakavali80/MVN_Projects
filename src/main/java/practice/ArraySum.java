package practice;
public class ArraySum {

    public static int calculateSum(int[] array) {
        int sum = 0;

        for (int num : array) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = calculateSum(numbers);

        System.out.println("Sum of the array elements: " + sum);
    }
}

