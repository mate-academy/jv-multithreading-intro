package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("The daemon thread is running " + Thread.currentThread().getName());
        }
    }
}
