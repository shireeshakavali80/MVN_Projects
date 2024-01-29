package strings;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        // Check if the strings are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are Anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are not Anagrams");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Check if either string is null or empty
        if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) {
            return false;
        }

        // Remove spaces and convert to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
