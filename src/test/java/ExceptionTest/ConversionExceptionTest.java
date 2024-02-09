package ExceptionTest;

import org.junit.jupiter.api.Test;
import Exception.ConversionException;
import static org.junit.jupiter.api.Assertions.*;

public class ConversionExceptionTest {

    @Test
    void testConvertStringToInt_SuccessfulConversion() {
        String input = "23";
        ConversionException conversionException = new ConversionException();
        int result = ConversionException.convertStringToInt(input);
        assertEquals(23, result);
    }

    @Test
    void testConvertStringToInt_InvalidInput() {
        String input = "45.67";
        ConversionException conversionException = new ConversionException();
        NumberFormatException exception = assertThrows(NumberFormatException.class, () -> {
            ConversionException.convertStringToInt(input);
        });
        assertEquals("For input string: \"45.67\"", exception.getMessage());
    }

    @Test
    void testConvertStringToInt_NonNumericInput() {
        String input = "test";
        ConversionException conversionException = new ConversionException();
        NumberFormatException exception = assertThrows(NumberFormatException.class, () -> {
            ConversionException.convertStringToInt(input);
        });
        assertEquals("For input string: \"test\"", exception.getMessage());
    }

    @Test
    void testConvertStringToInt_MixOfDigitsAndNonDigits() {
        String input = "123f";
        ConversionException conversionException = new ConversionException();
        NumberFormatException exception = assertThrows(NumberFormatException.class, () -> {
            ConversionException.convertStringToInt(input);
        });
        assertEquals("For input string: \"123f\"", exception.getMessage());
    }

    @Test
    void testConvertStringToInt_NullInput() {
        String input = null;
        ConversionException conversionException = new ConversionException();
        NumberFormatException exception = assertThrows(NumberFormatException.class, () -> {
            ConversionException.convertStringToInt(input);
        });
        assertEquals("Cannot parse null string", exception.getMessage());
    }
}
