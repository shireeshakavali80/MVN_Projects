package multithreadsTest;

import org.junit.Test;


import multithreads.DeadLock;
public class DeadLockTest {

    @Test
    public void testDeadlock() throws InterruptedException {
        DeadLock example = new DeadLock();

        // Create and start two threads
        Thread thread1 = new Thread(() -> example.method2());
        Thread thread2 = new Thread(() -> example.method2());
        thread1.start();
        thread2.start();

        // Join the threads to wait for their completion
        thread1.join();
        thread2.join();
    }
}