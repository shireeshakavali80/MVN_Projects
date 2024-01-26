package strings;

import java.util.Scanner;
public class NumberOfVowels {
    public static void main(String[] args) {
        String str="Shivani";
        vowelCount(str);
    }
    public static int vowelCount(String str) {
        if(str==null){
            return 0;
        }
        str = str.toLowerCase();
        int length = str.length();
        int count = 0;

        for (int i = 0; i < length; i++) {
            char alpha = str.charAt(i);
            if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
                count++;
            }
        }
        System.out.println("The number of vowels are " + count);
        return count;
    }


}

