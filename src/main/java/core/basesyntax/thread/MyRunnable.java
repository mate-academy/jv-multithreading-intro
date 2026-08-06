package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    private int count = 0;

    @Override
    public void run() {
        while (count <= 20) {
            System.out.println(count);
            count++;
        }
    }
}
