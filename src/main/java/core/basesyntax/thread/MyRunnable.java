package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    // write your code here

    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i <= 20; i++) {
            System.out.println(count++);
        }
    }
}
