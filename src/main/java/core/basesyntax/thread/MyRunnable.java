package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while (i > 0) {
            System.out.println("I am the daemon thread!");
        }
    }
}
