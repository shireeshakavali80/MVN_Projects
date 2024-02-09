package practice;
public class SwapCase {

    public static String swapCase(String input) {
        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];

            if (Character.isUpperCase(c)) {
                charArray[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                charArray[i] = Character.toUpperCase(c);
            }
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String input = "Hello World! 123";
        String result = swapCase(input);

        System.out.println("Original String: " + input);
        System.out.println("After swapping case: " + result);
    }
}

