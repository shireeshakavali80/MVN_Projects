package stream;

import java.util.Arrays;

public class VowelCount {
    public static void main(String[] args) {
        // Example array of strings
        String[] inputArray = {"apple", "banana", "grape", "pear", "kiwi", "java"};

        // Use Streams and Lambdas to filter and print strings with vowel count
        Arrays.stream(inputArray)
                .filter(str -> countVowels(str) > 0)
                .forEach(str -> System.out.println("String: " + str + " | Vowel Count: " + countVowels(str)));
    }

    // Method to count the number of vowels in a string
    public static long countVowels(String str) {
        return str.toLowerCase().chars().filter(ch -> "aeiou".indexOf(ch) != -1).count();
    }
}