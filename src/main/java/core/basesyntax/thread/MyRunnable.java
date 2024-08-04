package core.basesyntax.thread;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        do {
            System.out.println("I am the daemon thread!");
        } while (true);
    }
}
