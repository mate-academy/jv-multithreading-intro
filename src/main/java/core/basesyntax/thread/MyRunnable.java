package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Start MyRunnable! " + Thread.currentThread().getName());
        for (int i = 0; i <= 20; i++) {
            System.out.println("Number -  " + i + " " + Thread.currentThread().getName());
        }
    }
}
