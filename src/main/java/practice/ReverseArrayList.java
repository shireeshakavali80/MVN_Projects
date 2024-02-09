package practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {

    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }

    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);

        System.out.println("Original List: " + originalList);

        List<Integer> reversedList = reverseList(originalList);

        System.out.println("Reversed List: " + reversedList);
    }
}

