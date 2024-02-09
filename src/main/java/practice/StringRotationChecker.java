package practice;
public class StringRotationChecker {

    public static boolean isRotation(String str1, String str2) {
        // Check if the lengths are equal and not empty
        if (str1.length() != str2.length() || str1.isEmpty() || str2.isEmpty()) {
            return false;
        }

        // Concatenate str1 with itself
        String concatenated = str1 + str1;

        // Check if str2 is a substring of the concatenated string
        return concatenated.contains(str2);
    }

    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";

        System.out.println("Is '" + str2 + "' a rotation of '" + str1 + "': " + isRotation(str1, str2));
    }
}

