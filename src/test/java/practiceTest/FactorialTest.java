package practiceTest;

import org.junit.Test;
import practice.Factorial;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void testCalculateFactorialForZero() {
        Factorial FactorialCalculator;
        long result = Factorial.calculateFactorial(0);
        assertEquals(1, result);
    }

    @Test
    public void testCalculateFactorialForPositiveNumber() {
        Factorial FactorialCalculator = null;
        long result = Factorial.calculateFactorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testCalculateFactorialForNegativeNumber() {
        try {
            Factorial FactorialCalculator = null;
            Factorial.calculateFactorial(-3);
            // The line above should throw an IllegalArgumentException
        } catch (IllegalArgumentException e) {
            assertEquals("Factorial is not defined for negative numbers.", e.getMessage());
        }
    }
}