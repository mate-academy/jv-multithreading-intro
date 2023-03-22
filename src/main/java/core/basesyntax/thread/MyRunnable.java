package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Logic inside MyRunnable thread. " + Thread.currentThread().getName());
        while (true) {
            System.out.println("I am daemon thread!");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
