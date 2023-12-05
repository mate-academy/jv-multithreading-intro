package core.basesyntax.thread;

public class MyThread extends Thread {
    public MyThread(Runnable runnable) {
        super(runnable);
    }
}
