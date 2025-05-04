package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    private static volatile String string = "I am the daemon thread!";

    @Override
    public void run() {
        while (true) {
            System.out.println(string);
        }
    }
}
