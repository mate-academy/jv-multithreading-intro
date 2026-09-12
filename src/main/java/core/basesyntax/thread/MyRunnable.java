package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    int i = 0;

    @Override
    public void run() {
        while(i == 0) {
            System.out.println("I am the daemon thread!");
        }
    }
}
