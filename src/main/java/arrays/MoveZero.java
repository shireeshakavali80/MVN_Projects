package arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 8, 0, 7};
        int nonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }
        for (int i = nonZeroIndex; i < arr.length; i++) {
            arr[i] = 0;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
