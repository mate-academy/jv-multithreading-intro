package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        int count = 0;
        while (count <= 20) {
            System.out.println("Count: " + count);
            count++;
        }
    }
}
