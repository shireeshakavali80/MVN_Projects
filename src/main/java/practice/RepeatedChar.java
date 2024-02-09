package practice;
import java.util.HashMap;
import java.util.Map;

public class RepeatedChar {

    public static void main(String[] args) {
        String inputString = "programming";

        Map<Character, Integer> charCountMap = findRepeatedCharacters(inputString);

        System.out.println("Repeated characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static Map<Character, Integer> findRepeatedCharacters(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return charCountMap;
    }
}
