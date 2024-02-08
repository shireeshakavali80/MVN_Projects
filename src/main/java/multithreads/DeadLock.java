package multithreads;

public class DeadLock {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void method1() {
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + " acquired lock1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " waiting for lock2");
            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " acquired lock2");
            }
        }
    }

    public void method2() {
        synchronized (lock2) {
            System.out.println(Thread.currentThread().getName() + " acquired lock2");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " waiting for lock1");
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + " acquired lock1");
            }
        }
    }
}