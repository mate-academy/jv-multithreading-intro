package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main started");

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();

        System.out.println("Main is done");
    }
}
