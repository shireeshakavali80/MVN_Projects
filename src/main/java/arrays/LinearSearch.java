package arrays;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {1,2,4,5,8,9};
        int key = 8;
        for(int i=0;i<arr.length;i++){
            if(key == arr[i]){
                System.out.println("Element " + key + " Found at index "+ (i+1));
                break;
            }
        }
    }
}
