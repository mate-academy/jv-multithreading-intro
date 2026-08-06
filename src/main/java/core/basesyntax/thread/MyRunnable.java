package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        int num = 0;
        while (num <= 20) {
            System.out.println(num++);
        }
    }
}
