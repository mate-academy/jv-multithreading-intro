package core.basesyntax.thread;

public class MyRunnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("I am the daemon thread!");
        }
    }
}
