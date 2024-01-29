package loopsandconditions;

public class AgeClassifier {
    public static void main(String[] args) {
        int age = 24;
        classifyAge(age);
    }
    private static void classifyAge(int age) {
        if (age < 13) {
            System.out.println("Kid");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teen");
        } else {
            System.out.println("Adult");
        }
    }
}
