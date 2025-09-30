package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread counterThread = new MyThread();
        counterThread.setName("Counter-Thread");
        MyRunnable daemonTask = new MyRunnable();
        Thread daemonThread = new Thread(daemonTask, "Daemon-Checker");
        daemonThread.setDaemon(true);

        System.out.println("Starting Counter Thread (Non-Daemon)...");
        counterThread.start();

        System.out.println("Starting Daemon Thread...");
        daemonThread.start();

        System.out.println("Main thread finished execution.");
    }
}
