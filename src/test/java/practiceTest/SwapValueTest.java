package practiceTest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SwapValueTest {

    @Test
    public void testSwapWithoutThirdVariable() {
        int a = 5;
        int b = 10;

        // Call the swap method
        a = a + b;
        b = a - b;
        a = a - b;

        // Check if values are swapped correctly
        assertEquals(10, a);
        assertEquals(5, b);
    }
}