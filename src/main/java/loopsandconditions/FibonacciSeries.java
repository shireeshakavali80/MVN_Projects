package loopsandconditions;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        int N =10;
        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i < N; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
