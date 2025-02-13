package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();

        Thread daemonThread = new Thread(new MyRunnable());
        daemonThread.setDaemon(true);

        myThread.start();
        daemonThread.start();

        try {
            myThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main done");
    }
}
