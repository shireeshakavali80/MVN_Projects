package hashmap;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {

    public String removeDuplicates(String str) {
        // Convert string to character array
        char[] charArray = str.toCharArray();

        // Create a LinkedHashSet to maintain insertion order and uniqueness
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();

        // Add each character to the LinkedHashSet
        for (char ch : charArray) {
            uniqueChars.add(ch);
        }

        // Create a StringBuilder to construct the resulting string
        StringBuilder result = new StringBuilder();

        // Append each unique character to the StringBuilder
        for (char ch : uniqueChars) {
            result.append(ch);
        }

        return result.toString();
    }
}
