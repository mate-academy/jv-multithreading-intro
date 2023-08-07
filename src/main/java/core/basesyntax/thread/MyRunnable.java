package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    private static boolean x = true;

    @Override
    public void run() {
        while (x) {
            System.out.println("I am the daemon thread!");
        }
    }
}
