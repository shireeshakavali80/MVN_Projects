package arrays;

public class RotateElements {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int x = 3;
        int n = arr.length;
        x = x % n;
        int[] temp = new int[x];

        // Copy the first x elements to the temporary array
        for (int i = 0; i < x; i++) {
            temp[i] = arr[i];
        }

        // Shift the remaining elements to the left
        for (int i = x; i < n; i++) {
            arr[i - x] = arr[i];
        }
        // Copy back the temporary array to the end of the original array
        for (int i = 0; i < x; i++) {
            arr[n - x + i] = temp[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
