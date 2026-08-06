package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread name: " + Thread.currentThread().getName());

        MyThread firstThread = new MyThread("MyThread1");
        MyRunnable myRunnable = new MyRunnable();
        Thread secondThread = new Thread(myRunnable, "MyRunnable1");
        secondThread.setDaemon(true);

        firstThread.start();
        secondThread.start();

        assertTrue(secondThread.isDaemon());
    }

    private static void assertTrue(boolean state) {
        if (!state) {
            throw new RuntimeException("Something went wrong...");
        }
    }
}
