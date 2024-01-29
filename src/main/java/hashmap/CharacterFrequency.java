package hashmap;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void printCharacterFrequency(String input) {
        // Creating a HashMap to store character frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Counting the frequency of characters excluding spaces
        for (char c : input.toCharArray()) {
            if (c != ' ') {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        // Printing the character frequencies
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String input = "test string";
        printCharacterFrequency(input);
    }
}