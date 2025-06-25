package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();

        Thread daemonThread = new Thread(new MyRunnable());
        daemonThread.setDaemon(true);

        daemonThread.start();
        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
