package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Logic inside MyThread thread: "
                + Thread.currentThread().getName());
        for (int i = 0; i < 20; i++) {
            System.out.println("My number - " + i);
        }
    }
}
