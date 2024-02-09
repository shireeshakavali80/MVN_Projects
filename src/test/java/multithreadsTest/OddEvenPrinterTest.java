package multithreadsTest;

import org.junit.Test;
import multithreads.OddEvenPrinter;
public class OddEvenPrinterTest {

    @Test
    public void testOddEvenPrinting() throws InterruptedException {
        System.out.println("Test Case:");
        OddEvenPrinter printer = new OddEvenPrinter();
        printer.printOddEvenNumbers();
        // To ensure that test completes after threads execution
        Thread.sleep(1000); // Wait for 1 second
    }
}
