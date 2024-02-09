package practiceTest;
import org.junit.Test;
import practice.ReverseArrayList;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class ReverseArrayListTest {

    @Test
    public void testReverseList() {
        // Test case 1: Reversing a list with positive integers
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> reversedList1 = ReverseArrayList.reverseList(list1);
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), reversedList1);

        // Test case 2: Reversing a list with negative integers
        List<Integer> list2 = Arrays.asList(-1, -2, -3, -4, -5);
        List<Integer> reversedList2 = ReverseArrayList.reverseList(list2);
        assertEquals(Arrays.asList(-5, -4, -3, -2, -1), reversedList2);

        // Test case 3: Reversing an empty list
        List<Integer> list3 = Arrays.asList();
        List<Integer> reversedList3 = ReverseArrayList.reverseList(list3);
        assertEquals(Arrays.asList(), reversedList3);
    }
}
