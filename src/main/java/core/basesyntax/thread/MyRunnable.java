package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Run and run! Thread name is: " + Thread.currentThread().getName());
        }
    }
}
