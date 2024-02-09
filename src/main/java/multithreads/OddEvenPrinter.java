package multithreads;
public class OddEvenPrinter {

    public void printOddEvenNumbers() {
        // Creating two threads
        Thread evenThread = new Thread(new EvenPrinter());
        Thread oddThread = new Thread(new OddPrinter());

        // Starting the threads
        evenThread.start();
        oddThread.start();
    }
}

class EvenPrinter implements Runnable {

    @Override
    public void run() {
        for (int i = 2; i <= 60; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddPrinter implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 59; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

