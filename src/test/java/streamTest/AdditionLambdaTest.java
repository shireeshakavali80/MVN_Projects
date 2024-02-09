package streamTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@FunctionalInterface
interface MathOperationInterface {
    int operate(int a, int b);
}

public class AdditionLambdaTest {

    @Test
    void testAdditionLambda() {
        MathOperationInterface addition = (a, b) -> a + b;

        // Test case 1: Positive numbers
        assertEquals(8, addition.operate(5, 3));

        // Test case 2: Negative numbers
        assertEquals(-2, addition.operate(-5, 3));

        // Test case 3: Zero
        assertEquals(5, addition.operate(5, 0));

        // Test case 4: Large numbers
        assertEquals(2147483647, addition.operate(1073741823, 1073741824));
    }
}
