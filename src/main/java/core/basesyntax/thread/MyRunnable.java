package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        int i = -1;
        while (i < 20) {
            i++;
            System.out.println(i);
        }
    }
}
