package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    private String threadName;

    public MyRunnable(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("I am the daemon thread!");
        }
    }
}
