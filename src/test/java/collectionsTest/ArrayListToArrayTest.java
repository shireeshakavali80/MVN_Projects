package collectionsTest;

import collections.RemoveStudentsBelowAverage;
import collections.Student;
import hashmap.StudentHashMap;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Map;

import collections.ArrayListToArray;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Enclosed.class)
public class ArrayListToArrayTest {

    @Test
    public void testConvertToArray() {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");

        // Create an instance of the class to test
        ArrayListToArray converter = new ArrayListToArray();

        // Test converting ArrayList to array
        String[] expectedArray = {"Apple", "Banana", "Orange"};
        String[] actualArray = converter.convertToArray(stringList);

        // Verify the converted array
        assertArrayEquals(expectedArray, actualArray);
    }

    public static class RemoveStudentsBelowAverageTest {

        @Test
        public void testRemoveBelowAverageGPA() {
            // Create an ArrayList of Students
            ArrayList<Student> studentList = new ArrayList<>();
            studentList.add(new Student("John", "Doe", 3.5));
            studentList.add(new Student("Jane", "Smith", 3.2));
            studentList.add(new Student("Alice", "Johnson", 3.8));

            // Create an instance of the class to test
            RemoveStudentsBelowAverage remover = new RemoveStudentsBelowAverage();

            // Test removing students with GPA below average
            remover.removeBelowAverageGPA(studentList);

            // Verify the remaining students
            assertEquals(2, studentList.size());
            assertEquals("John", studentList.get(0).firstName);
        }

        public static class StudentHashMapTest {

            @Test
            public void testGetStudentByName() {
                StudentHashMap studentHashMap = new StudentHashMap();

                // Test Case 1: Valid student name
                String searchName1 = "Alice";
                StudentHashMap.Student result1 = studentHashMap.getStudentByName(searchName1);
                assertEquals("Alice", result1.firstName);
                assertEquals("Johnson", result1.lastName);
                assertEquals(3.8, result1.GPA, 0.01);

                // Test Case 2: Invalid student name
                String searchName2 = "InvalidName";
                StudentHashMap.Student result2 = studentHashMap.getStudentByName(searchName2);
                assertNull(result2);
            }

            @Test
            public void testInitialStudentMapSize() {
                StudentHashMap studentHashMap = new StudentHashMap();
                Map<String, StudentHashMap.Student> studentMap = studentHashMap.getStudentMap();

                // Test the initial size of the student map
                assertEquals(8, studentMap.size());
            }
        }
    }
}
