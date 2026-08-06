package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable is working. name : "
                + Thread.currentThread().getName());
        while (true) {
            System.out.println("I am the daemon thread!");
        }
    }
}
