package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    private static int BOUND = 21;

    @Override
    public void run() {
        for (int i = 0; i < BOUND; i++) {
            System.out.println(i);
        }
    }
    // write your code here
}
