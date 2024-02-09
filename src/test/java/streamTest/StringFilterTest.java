package streamTest;


    import org.junit.jupiter.api.Test;
    import stream.StringFilter;

    import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

    public class StringFilterTest {

        @Test
        void testFilterStringsStartingWithA() {
            List<String> inputList = List.of("Apple", "Banana", "Orange", "Grape");

            StringFilter StringFilter;
            List<String> result = stream.StringFilter.filterStringsStartingWithA(inputList);

            // Assert that the result does not contain strings starting with "A"
            assertFalse(result.contains("Apple"));
            assertFalse(result.contains("Orange"));

            // Assert that the result contains strings not starting with "A"
            assertTrue(result.contains("Banana"));
            assertTrue(result.contains("Grape"));
        }

        @Test
        void testFilterStringsStartingWithA_EmptyList() {
            List<String> inputList = List.of();

            List<String> result = StringFilter.filterStringsStartingWithA(inputList);

            // Assert that the result is an empty list
            assertTrue(result.isEmpty());
        }

        @Test
        void testFilterStringsStartingWithA_AllStartingWithA() {
            List<String> inputList = List.of("Apple", "Apricot", "Avocado");

            List<String> result = StringFilter.filterStringsStartingWithA(inputList);

            // Assert that the result is an empty list
            assertTrue(result.isEmpty());
        }
    }


