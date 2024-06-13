package core.basesyntax.syncro;

import java.time.LocalTime;

class SharedResource {
    private final Object monitor = new Object();

    public void access(String threadName) {
        synchronized (monitor) {  // Acquiring the monitor lock
            System.out.println(threadName + " entered synchronized block. " + LocalTime.now());
            try {
                // Simulate some work with a sleep
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException("interrupted exception occurred", e);
            }
            System.out.println(threadName + " exiting synchronized block. " + LocalTime.now());
        }  // Releasing the monitor lock
    }
}

public class Example {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(() -> resource.access("Thread 1"));
        Thread t2 = new Thread(() -> resource.access("Thread 2"));
        Thread t3 = new Thread(() -> resource.access("Thread 3"));

        t1.start();
        t2.start();
        t3.start();
    }
}
