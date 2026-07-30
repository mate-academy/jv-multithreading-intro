package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is created!: " + Thread.currentThread().getName());
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        System.out.println("MyThread ended!");
    }
}
