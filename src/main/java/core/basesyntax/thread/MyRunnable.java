package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        int a = 0;
        for (int i = 0; i < 21; i++) {
            System.out.println(a);
            a++;
        }
    }
}
