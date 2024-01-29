package hashmap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class StudentHashMap {

    private Map<String, Student> studentMap;

    public StudentHashMap() {
        studentMap = new HashMap<>();
        // Adding 8 students to the HashMap
        studentMap.put("John", new Student("John", "Doe", 3.5));
        studentMap.put("Jane", new Student("Jane", "Smith", 3.2));
        studentMap.put("Alice", new Student("Alice", "Johnson", 3.8));
        studentMap.put("Bob", new Student("Bob", "Williams", 3.1));
        studentMap.put("Charlie", new Student("Charlie", "Brown", 3.9));
        studentMap.put("David", new Student("David", "Jones", 3.4));
        studentMap.put("Eva", new Student("Eva", "Taylor", 3.7));
        studentMap.put("Frank", new Student("Frank", "Miller", 3.6));
    }

    public Student getStudentByName(String firstName) {
        return studentMap.get(firstName);
    }

    public static void main(String[] args) {
        StudentHashMap studentHashMap = new StudentHashMap();

        // Example: Retrieving a student by name
        String searchName = "Alice";
        Student result = studentHashMap.getStudentByName(searchName);

        if (result != null) {
            System.out.println("Student found for " + searchName + ": " + result);
        } else {
            System.out.println("Student not found for " + searchName);
        }
    }

    // Getter for the studentMap (for testing purposes)
    public Map<String, Student> getStudentMap() {
        return studentMap;
    }

    // Student class
    public static class Student {
        public String firstName;
        public String lastName;
        public double GPA;

        public Student(String firstName, String lastName, double GPA) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.GPA = GPA;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", GPA=" + GPA +
                    '}';
        }
    }

    public static class HashSetIteration {

        public static void main(String[] args) {
            // Create a HashSet
            HashSet<String> stringSet = new HashSet<>();

            // Add 10 strings to the HashSet
            stringSet.add("Apple");
            stringSet.add("Banana");
            stringSet.add("Orange");
            stringSet.add("Grapes");
            stringSet.add("Pineapple");
            stringSet.add("Strawberry");
            stringSet.add("Mango");
            stringSet.add("Peach");
            stringSet.add("Watermelon");
            stringSet.add("Kiwi");

            // Iterate over the HashSet using Iterator
            System.out.println("Iterating over HashSet using Iterator:");
            Iterator<String> iterator = stringSet.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

            // Iterate over the HashSet using for loop
            System.out.println("\nIterating over HashSet using for loop:");
            Object[] array = stringSet.toArray();
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }

            // Iterate over the HashSet using enhanced for loop
            System.out.println("\nIterating over HashSet using enhanced for loop:");
            for (String str : stringSet) {
                System.out.println(str);
            }
        }
    }
}