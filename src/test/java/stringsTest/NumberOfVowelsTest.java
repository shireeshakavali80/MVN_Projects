package stringsTest;
import strings.NumberOfVowels;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumberOfVowelsTest {

    @Test
    public void testCountVowels_successful() {
        int count = NumberOfVowels.vowelCount("aeiou");
        assertEquals(5, count);
    }

    @Test
    public void testCountVowels_nullInput() {
        int count = NumberOfVowels.vowelCount(null);
        assertEquals(0, count);
    }

    @Test
    public void testCountVowels_emptyInput() {
        int count = NumberOfVowels.vowelCount("");
        assertEquals(0, count);
    }

    @Test
    public void testCountVowels_mixedCase() {
        int count = NumberOfVowels.vowelCount("aEiOu");
        assertEquals(5, count);
    }

    @Test
    public void testCountVowels_noVowels() {
        int count = NumberOfVowels.vowelCount("bcdxyz");
        assertEquals(0, count);
    }
}
