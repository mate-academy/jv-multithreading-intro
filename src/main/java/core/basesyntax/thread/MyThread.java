package core.basesyntax.thread;

public class MyThread extends Thread {
    private static final String MESSAGE = "I am the daemon thread!";

    @Override
    public void run() {
        while (true) {
            System.out.println(MESSAGE);
        }
    }
}
