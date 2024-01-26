package strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");
        String s = sc.nextLine();

        String[] sa = s.split("\\s");

        reverseWords(sa);

        for (int i = 0; i < sa.length; i++) {
            System.out.print(sa[i] + " ");
        }
    }

    public static String[] reverseWords(String[] words) {
        if (words == null) {
            return new String[0];
        }

        for (int i = 0; i < words.length; i++) {
            StringBuffer sb = new StringBuffer(words[i]);
            sb.reverse();
            words[i] = sb.toString();
        }
        return words;
    }
}
