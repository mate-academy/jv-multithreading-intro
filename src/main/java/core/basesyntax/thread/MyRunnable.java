package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    private static final String DAEMON_MESSAGE = "I am the daemon thread!";

    @Override
    public void run() {
        while (true) {
            System.out.println(DAEMON_MESSAGE);
        }
    }
}
