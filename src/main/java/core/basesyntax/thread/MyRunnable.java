package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.err.print("I am the DAEMON thread! ");
        }
    }
}
