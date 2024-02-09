package practice;
import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {

    public static Map<String, Integer> countUniqueWords(String input) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = input.split("\\s+");

        for (String word : words) {
            // Remove punctuation and convert to lowercase for case-insensitive comparison
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        return wordCountMap;
    }

    public static void main(String[] args) {
        String input = "Java is a programming language. Java is widely used for web development.";

        Map<String, Integer> wordCountMap = countUniqueWords(input);

        System.out.println("Unique words and their counts:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

