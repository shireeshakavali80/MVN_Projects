package multithreads;
public class Singleton {
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {
    }

    // Static method to get the singleton instance
    public static Singleton getInstance() {
        // Lazy initialization - create the instance only when needed
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Method to perform some operation
    public void performOperation() {
        System.out.println("Singleton instance is performing an operation.");
    }
}

