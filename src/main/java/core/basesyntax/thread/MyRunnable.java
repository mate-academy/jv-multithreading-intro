package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("I'm demon thread!");
        }
    }
}
