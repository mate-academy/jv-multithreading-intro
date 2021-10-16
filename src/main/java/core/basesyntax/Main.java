package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("MyThread");
        myThread.setDaemon(true);

        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.setName("MyRunnable");

        myThread.start();
        myRunnable.start();
    }
}
