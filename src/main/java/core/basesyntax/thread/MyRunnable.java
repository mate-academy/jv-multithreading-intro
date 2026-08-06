package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println("MyRunnable is created. Thread name:"
                    + Thread.currentThread().getName() + " " + "count-" + i);
        }
    }
}
