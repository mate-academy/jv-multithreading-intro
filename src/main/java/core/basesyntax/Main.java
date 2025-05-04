package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());
        Thread myThread = new MyThread();
        myThread.start();
        Runnable runnable = new MyRunnable();
        Thread myRunnable = new Thread(runnable);
        myRunnable.start();
    }
}
