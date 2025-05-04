package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        while (true) {
            System.out.println(String.format("I'm %s - a daemon thread!",
                    currentThread.getName()));
        }
    }
}
