package core.basesyntax.thread;

public class MyThread extends Thread {
    private static final String DAEMON_THREAD = "I am the daemon thread!";

    @Override
    public void run() {
        while (true) {
            System.out.println(DAEMON_THREAD);
        }
    }
}
