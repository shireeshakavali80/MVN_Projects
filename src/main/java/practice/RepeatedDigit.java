package practice;
import java.util.HashMap;
import java.util.Map;

public class RepeatedDigit {
    public static void main(String[] args) {
        // Replace this with your input number
        int inputNumber = 129321;

        Map<Character, Integer> digitCountMap = new HashMap<>();

        // Convert the input number to a string to iterate over its digits
        String numberStr = Integer.toString(inputNumber);

        // Count the occurrences of each digit
        for (char digit : numberStr.toCharArray()) {
            digitCountMap.put(digit, digitCountMap.getOrDefault(digit, 0) + 1);
        }

        // Print the digits that are repeated more than once
        System.out.println("Digits repeated more than once:");
        for (Map.Entry<Character, Integer> entry : digitCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
