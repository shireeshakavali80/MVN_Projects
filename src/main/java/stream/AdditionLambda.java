
package stream;

// Functional Interface
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class AdditionLambda {

    public static void main(String[] args) {
        // Using Lambda Expression to implement addition
        MathOperation addition = Integer::sum;

        // Example usage
        int result = addition.operate(5, 3);
        System.out.println("Result of addition: " + result);
    }
}



