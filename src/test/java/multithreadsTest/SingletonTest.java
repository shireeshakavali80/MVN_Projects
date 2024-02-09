package multithreadsTest;

import multithreads.Singleton;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SingletonTest {

    @Test
    public void testSingletonInstance() {
        // Get the singleton instance
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Check if both instances are the same object
        assertEquals("Both instances should be the same object", instance1, instance2);
    }

    @Test
    public void testSingletonOperation() {
        // Get the singleton instance
        Singleton instance = Singleton.getInstance();

        // Perform an operation
        instance.performOperation();

        // Add more assertions if needed
    }

//    @Test
//    public void testCreateAnotherInstance() {
//        // Get the singleton instance
//        Singleton instance1 = Singleton.getInstance();
//
//        // Try to create another instance
//        Singleton instance2 = new Singleton();
//
//        // Verify that attempting to create another instance returns false
//        assertFalse("Another instance should not be created", instance1 != instance2);
//    }
}

