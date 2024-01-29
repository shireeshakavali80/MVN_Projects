package strings;

public class CheckRotate {
    public static void main(String[] args) {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";
        if (str1.length() != str2.length() || str1.isEmpty() || str2.isEmpty()) {
            System.out.println("False");
        }
        // Concatenate the first string with itself
        String concatenatedStr = str1 + str1;
        System.out.println(concatenatedStr.contains(str2));
    }

    public static boolean areRotatedStrings(String str1, String str2) {
        // Check if either string is null or empty
        if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) {
            return false;
        }

        // Check if the lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Concatenate the first string with itself
        String concatenatedStr = str1 + str1;

        // Check if the second string is a substring of the concatenated string
        return concatenatedStr.contains(str2);
    }
}
